package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int i;
        int charSize = 0, count = 0;

        while ((i = bufferedInputStream.read()) != -1){
            charSize++;
            if (((int) i) == ((int) ' ')){
                count++;
            }
        }
        fileInputStream.close();
        bufferedInputStream.close();

        double result = (double)100 * count / charSize;

        System.out.printf("%.2f", result);

    }
}
