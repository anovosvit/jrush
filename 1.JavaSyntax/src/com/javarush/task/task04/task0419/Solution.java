package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5, num6;

        if (num1 < num2)
            num5 = num2;
        else
            num5 = num1;

        if (num3 < num4)
            num6 = num4;
        else
            num6 = num3;

        if (num5 < num6)
            System.out.println(num6);
        else
            System.out.println(num5);

    }
}
