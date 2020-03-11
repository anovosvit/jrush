package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader = new FileReader(file1);
        int count = 0;
        String str = "";

        while (fileReader.ready()){
            char symbol = (char) fileReader.read();
            str += String.valueOf(symbol).toLowerCase();
        }

        str = str.replaceAll("\\p{Punct}", " ");
        str = str.replaceAll("\n", " ");
        //System.out.println(str);

        String[] mas = str.split(" ");
        for(String s: mas){
            s = s.trim();
            if (s.equals("world"))
                count++;
        }

        System.out.println(count);
        fileReader.close();
    }
}
