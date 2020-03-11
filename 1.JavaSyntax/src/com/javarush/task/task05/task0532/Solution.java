package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine()); //считываем n
        int maximum = 0; //инициализируем число maximum

        for (int i = 0; i<n; i++){ //входим в цикл по числу n

            //считываем число с консоли
            int temp = Integer.parseInt(reader.readLine());

            //если это нулевой цикл, то присваиваем числу
            //maximum значение считанного числа
            if (i==0) maximum=temp;

                //в дальнейшем значение присваиваем только если
                //число с консоли больше maximum
            else if (temp>maximum) maximum=temp;
        }

        System.out.println(maximum);
    }
}
