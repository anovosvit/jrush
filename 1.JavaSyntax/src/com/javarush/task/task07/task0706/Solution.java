package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] a = new int[15];
        int b = 0, c = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
            if (i % 2 == 0) {
                b = b + a[i];
            } else c = c + a[i];
        }

        if (b > c) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");


    }
}
