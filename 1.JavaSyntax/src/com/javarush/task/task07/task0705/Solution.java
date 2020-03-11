package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[20];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        int[] a = new int[10];
        int[] b = new int[10];

        a = Arrays.copyOfRange(array, 0, 9);
        b = Arrays.copyOfRange(array, 10, 20);

        for (int i=0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
    }
}
