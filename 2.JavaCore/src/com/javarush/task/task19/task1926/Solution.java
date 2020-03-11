package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName.readLine()))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String reverse = new StringBuilder(line).reverse().toString();
                System.out.println(reverse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
