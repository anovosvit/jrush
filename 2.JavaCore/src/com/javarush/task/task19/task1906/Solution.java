package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String file1 = scanner.readLine();
        String file2 = scanner.readLine();
        scanner.close();

        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);
        ArrayList<Character> arrayList = new ArrayList<Character>();

        while (fileReader.ready()){
            int data = fileReader.read();
            arrayList.add((char) data);
        }

        for (int i = 0; i < arrayList.size(); i++){
            if ((i + 1) % 2 == 0){
                fileWriter.write(arrayList.get(i));
            }

        }

        fileReader.close();
        fileWriter.close();
    }
}
