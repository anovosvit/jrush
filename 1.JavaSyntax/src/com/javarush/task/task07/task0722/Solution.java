package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        boolean s = true;
        while (s){
            String a = reader.readLine();
            if (a.equals("end")){
                s = false;
                break;
            }
            else
                list.add(a);
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}