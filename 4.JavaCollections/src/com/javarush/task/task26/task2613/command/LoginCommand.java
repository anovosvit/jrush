package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.util.ResourceBundle;

import static com.javarush.task.task26.task2613.CashMachine.RESOURCE_PATH;

public class LoginCommand implements Command {

    private ResourceBundle validCreditCards = ResourceBundle.getBundle(RESOURCE_PATH + ".verifiedCards");
    private ResourceBundle res = ResourceBundle.getBundle(RESOURCE_PATH + ".login_en");



    @Override
    public void execute() throws InterruptOperationException {
        //Enumeration<String> cardNumbers = validCreditCards.getKeys();
        ConsoleHelper.writeMessage(res.getString("before"));
        while (true) {
            ConsoleHelper.writeMessage(res.getString("specify.data"));
            String cardNumber = ConsoleHelper.readString();
            String pinCode = ConsoleHelper.readString();

            if ((cardNumber.matches("\\d{12}") && pinCode.matches("\\d{4}"))) {
                boolean isLogin = false;
                //while (cardNumbers.hasMoreElements())
                if (validCreditCards.containsKey(cardNumber) && validCreditCards.getString(cardNumber).equals(pinCode)) {

                    ConsoleHelper.writeMessage(String.format(res.getString("success.format"), cardNumber));
                    break;
                }
                else {
                    ConsoleHelper.writeMessage(String.format(res.getString("not.verified.format"), cardNumber));
                    ConsoleHelper.writeMessage(res.getString("try.again.or.exit"));
                    continue;
                }

            } else {
                ConsoleHelper.writeMessage(String.format(res.getString("not.verified.format"), cardNumber));
                ConsoleHelper.writeMessage(res.getString("try.again.with.details"));
                continue;
            }
        }
    }
}
