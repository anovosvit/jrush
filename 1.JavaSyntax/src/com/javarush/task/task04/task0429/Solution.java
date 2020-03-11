package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int num1 = Integer.parseInt(number1);

        String number2 = reader.readLine();
        int num2 = Integer.parseInt(number2);

        String number3 = reader.readLine();
        int num3 = Integer.parseInt(number3);

        int PosCount=0;
        int NegCount=0;

        if(num1>0)
        {
            PosCount++;
        }
        if(num2>0)
        {
            PosCount++;
        }
        if(num3>0)
        {
            PosCount++;
        }

        if(num1<0)
        {
            NegCount++;
        }
        if(num2<0)
        {
            NegCount++;
        }
        if(num3<0)
        {
            NegCount++;
        }

        System.out.println("количество отрицательных чисел: "+NegCount);
        System.out.println("количество положительных чисел: "+PosCount);

    }
}
