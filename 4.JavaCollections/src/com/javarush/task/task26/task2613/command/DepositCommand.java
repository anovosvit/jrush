package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.CurrencyManipulator;
import com.javarush.task.task26.task2613.CurrencyManipulatorFactory;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.util.ResourceBundle;

import static com.javarush.task.task26.task2613.CashMachine.RESOURCE_PATH;

class DepositCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(RESOURCE_PATH + ".deposit_en");

    @Override
    public void execute() throws InterruptOperationException {
        System.out.println(res.getString("before"));
        String currencyCode = ConsoleHelper.askCurrencyCode();
        String[] twoDigits = ConsoleHelper.getValidTwoDigits(res.getString("invalid.data"));
        int denomination = Integer.valueOf(twoDigits[0]);
        int count = Integer.valueOf(twoDigits[1]);
        CurrencyManipulator cm = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
        cm.addAmount(denomination, count);
        System.out.println(String.format(res.getString("success.format"), denomination * count, currencyCode));
    }
}
