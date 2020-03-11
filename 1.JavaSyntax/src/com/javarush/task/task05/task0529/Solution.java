package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner buffer = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String s = buffer.nextLine();
            if (s.equals("сумма")) {

                System.out.println(sum);
                break;
            }
            int s1 = Integer.parseInt(s);
            sum += s1;
        }
    }
}
