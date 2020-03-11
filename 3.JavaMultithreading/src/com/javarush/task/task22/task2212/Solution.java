package com.javarush.task.task22.task2212;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) return false;
        if (telNumber == "") return false;
        if (telNumber.matches("\\w")) return false;
        return telNumber.matches("\\+?(\\d{2})?\\(?(\\d{3})\\)?(\\d{3}[-]?\\d{2}[-]?\\d{2})");
    }

    public static void main(String[] args) {
        //for tests
        System.out.println(checkTelNumber("+380501234567")  + " " + 1);
        System.out.println(checkTelNumber("+38(050)1234567")  + " " + 2);
        System.out.println(checkTelNumber("+38050123-45-67")  + " " + 3);
        System.out.println(checkTelNumber("050123-4567")  + " " + 4);
        System.out.println(checkTelNumber("+38)050(1234567")  + " " + 5);
        System.out.println(checkTelNumber("+38(050)1-23-45-6-7")  + " " + 6);
        System.out.println(checkTelNumber("050ххх4567")  + " " + 7);
        System.out.println(checkTelNumber("050123456")  + " " + 8);
        System.out.println(checkTelNumber("(0)501234567")  + " " + 9);
    }
}
