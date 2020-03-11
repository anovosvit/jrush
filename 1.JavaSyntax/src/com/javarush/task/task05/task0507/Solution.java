package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        float s = 0; int i = Integer.parseInt(r.readLine()), n = 1;
        for (; i != -1;) {
            s = (s + i);
            i = Integer.parseInt(r.readLine());
            n++;
        }
        System.out.println(s / (n - 1));
    }
}

