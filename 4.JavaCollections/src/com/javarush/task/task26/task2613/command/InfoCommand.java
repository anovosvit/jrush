package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.CurrencyManipulator;
import com.javarush.task.task26.task2613.CurrencyManipulatorFactory;

import java.util.Collection;
import java.util.ResourceBundle;

import static com.javarush.task.task26.task2613.CashMachine.RESOURCE_PATH;

class InfoCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(RESOURCE_PATH + ".info_en");


    @Override
    public void execute() {
        Collection<CurrencyManipulator> bills = CurrencyManipulatorFactory.getAllCurrencyManipulators();
        boolean hasMoney = false;

        for (CurrencyManipulator bill : bills) {
            if (bill.hasMoney()) {
                hasMoney = true;
                System.out.println(res.getString("before"));
                System.out.println(bill.getCurrencyCode() + " - " + bill.getTotalAmount());
            }
        }

        if (!hasMoney) {
            System.out.println(res.getString("no.money"));
        }
    }
}
