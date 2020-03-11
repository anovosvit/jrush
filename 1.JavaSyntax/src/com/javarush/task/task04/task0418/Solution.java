package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num <= num2)
            System.out.println(num);
        else
            System.out.println(num2);


    }
}