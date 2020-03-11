package com.javarush.task.task26.task2613;

import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class ConsoleHelper {
    private static ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.common_en");
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {

        System.out.println(message);
    }

    public static String readString() throws InterruptOperationException{
        String result = "";
        try {
            result = bis.readLine();
            if (result.equalsIgnoreCase("EXIT")) {
                throw new InterruptOperationException();
            }
        } catch (IOException e) {

        }
        return result;
    }

    public static Operation askOperation() throws InterruptOperationException{
        do {
            writeMessage(res.getString("choose.operation"));
            writeMessage("Choice operation:\n1) INFO\n2) DEPOSIT\n3) WITHDRAW\n4) EXIT");
            try {
                String input = readString();
                return Operation.getAllowableOperationByOrdinal(Integer.parseInt(input));
            } catch (IllegalArgumentException e) {
                writeMessage(res.getString("invalid.data"));
                continue;
            }
        } while (true);
    }

    public static String askCurrencyCode() throws InterruptOperationException {
        String code = null;
        while (true) {
            writeMessage(res.getString("choose.currency.code"));
            code = readString();
            if (code.length() == 3)
                break;
            else
                writeMessage(res.getString("invalid.data"));

        }
        return code.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {


        String[] input = new String[2];
        while (true) {
            ConsoleHelper.writeMessage(String.format(res.getString("choose.denomination.and.count.format"), currencyCode));
            input = readString().split(" ");

            int nominal = 0;
            int total = 0;
            try {
                nominal = Integer.parseInt(input[0]);
                total = Integer.parseInt(input[1]);
            } catch (Exception e) {
                writeMessage(res.getString("invalid.data"));
                continue;
            }
            if (nominal <= 0 || total <= 0 || input.length > 2) {
                writeMessage(res.getString("invalid.data"));
                continue;
            }
            break;
        }
        return input;
    }

    public static void printExitMessage() {
        ConsoleHelper.writeMessage(res.getString("the.end"));
    }
}
