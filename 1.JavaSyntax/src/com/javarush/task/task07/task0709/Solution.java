package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++){
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            list.add(s);
        }

        int min = list.get(0).length();
        for (int i = 0; i < 5; i++){
            if (min > list.get(i).length())
                min = list.get(i).length();
        }

        for (int i = 0; i < 5; i++){
            if (list.get(i).length() == min)
                System.out.println(list.get(i));
        }
    }
}
