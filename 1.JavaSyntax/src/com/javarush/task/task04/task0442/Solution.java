package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            sum += number;

            if (number == -1) {
                System.out.println(sum);
                break;
            }

        }
    }
}
