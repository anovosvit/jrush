package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i, b, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
        s1 = 1;
        s2 = 2;
        s3 = 3;
        s4 = 4;
        s5 = 5;
        s6 = 6;
        s7 = 7;
        s8 = 8;
        s9 = 9;
        s10 = 10;
        b = 1;
        i = 1;

        while (i <= 10){
            System.out.print(s1 * b + " ");
            System.out.print(s2 * b + " ");
            System.out.print(s3 * b + " ");
            System.out.print(s4 * b + " ");
            System.out.print(s5 * b + " ");
            System.out.print(s6 * b + " ");
            System.out.print(s7 * b + " ");
            System.out.print(s8 * b + " ");
            System.out.print(s9 * b + " ");
            System.out.println(s10 * b + " ");

            i++;
            b++;
        }
    }
}
