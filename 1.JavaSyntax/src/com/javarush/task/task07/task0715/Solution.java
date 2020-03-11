package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "мама", "мыла", "раму");

        for (int i = 0; i < 6; i++){
            list.add(++i, "именно");
        }

        for (int i = 0; i < 6; i++){
            System.out.println(list.get(i));
        }


    }
}
