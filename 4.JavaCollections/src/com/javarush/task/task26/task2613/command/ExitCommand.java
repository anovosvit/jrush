package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.util.ResourceBundle;

import static com.javarush.task.task26.task2613.CashMachine.RESOURCE_PATH;

class ExitCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(RESOURCE_PATH + ".exit_en");


    @Override
    public void execute() throws InterruptOperationException {
        System.out.println(res.getString("exit.question.y.n"));
        String s = ConsoleHelper.readString();
        if (s.equalsIgnoreCase("Y")) {
            System.out.println(res.getString("thank.message"));
        }
    }
}
