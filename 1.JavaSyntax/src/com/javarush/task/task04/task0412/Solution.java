package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x > 0)
            System.out.println(x * 2);
        else if (x < 0)
            System.out.println(x + 1);
        else
            System.out.println(x);

    }

}