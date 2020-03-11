package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String number = reader.readLine();
        int num = Integer.parseInt(number);

        if ((num>0) && !(num%2==0)&&((num>=100)&&(num<=999)))
        {
            System.out.println("нечетное трехзначное число");
        }
        if ((num>0) && (num%2==0)&&((num>=100)&&(num<=999)))
        {
            System.out.println("четное трехзначное число");
        }


        if ((num>0) && !(num%2==0)&&((num>=10)&&(num<=99)))
        {
            System.out.println("нечетное двузначное число");
        }
        if ((num>0) && (num%2==0)&&((num>=10)&&(num<=99)))
        {
            System.out.println("четное двузначное число");
        }


        if ((num>0) && !(num%2==0)&&((num>=0)&&(num<=9)))
        {
            System.out.println("нечетное однозначное число");
        }
        if ((num>0) && (num%2==0)&&((num>=0)&&(num<=9)))
        {
            System.out.println("четное однозначное число");
        }

    }
}
