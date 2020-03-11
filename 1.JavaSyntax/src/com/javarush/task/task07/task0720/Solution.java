package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        String s1 = reader.readLine();
        int m = Integer.parseInt(s1);
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++){
            list.add(reader.readLine());
        }

        for (int i = 0; i < m; i++) {
            String a = list.get(0);
            list.remove(0);
            list.add(a);
        }

        for (String a : list) {
            System.out.println(a);
        }
    }
}
