package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        String a = num.readLine();
        double t = Double.parseDouble(a);

        if((t % 5 >= 0) && (t % 5 < 3))
            System.out.println("зеленый");
        if((t % 5 < 4) && (t % 5 >= 3))
            System.out.println("желтый");
        if((t % 5 < 5) && (t % 5 >= 4))
            System.out.println("красный");
    }
}