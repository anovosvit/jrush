package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            strings.add(s);
        }

        int m = strings.get(0).length();
        for (String s : strings)
            if (s.length() > m)
                m = s.length();
        // 4. Выведи найденную строку на экран.
        // 5. Если таких строк несколько, выведи каждую с новой строки.
        for (String s : strings)
            if (s.length() == m)
                System.out.println(s);
    }
}
