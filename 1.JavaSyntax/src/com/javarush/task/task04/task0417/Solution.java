package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a == b) && (b == c))
            System.out.println(a + " " + b + " " + c);
        else if (a == b)
            System.out.println(a + " " + b);
        else if (b == c)
            System.out.println(b + " " + c);
        else if (c == a)
            System.out.println(a + " " + c);
        else
            return;

    }
}