package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        ArrayList<Integer> stringList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i])) {
                intList.add(i);
            } else {
                stringList.add(i);
            }
        }

        for (int i = (stringList.size() - 1); i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                int num = stringList.get(j);
                int numNext = stringList.get(j + 1);
                if (isGreaterThan(array[num], array[numNext])) {
                    String tmp = array[num];
                    array[num] = array[numNext];
                    array[numNext] = tmp;
                }
            }
        }

        for (int i = (intList.size() - 1); i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                int num = intList.get(j);
                int numNext = intList.get(j + 1);
                if (Integer.parseInt(array[numNext]) > Integer.parseInt(array[num])) {
                    String tmp = array[num];
                    array[num] = array[numNext];
                    array[numNext] = tmp;
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
