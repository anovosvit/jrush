package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++){
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }

        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}

