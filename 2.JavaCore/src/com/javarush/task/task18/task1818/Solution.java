package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        FileInputStream fileInputStream3 = new FileInputStream(fileName3);
        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);
        fileInputStream2.close();
        byte[] buffer3 = new byte[fileInputStream3.available()];
        fileInputStream3.read(buffer3);
        fileInputStream3.close();
        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);
        fileOutputStream1.write(buffer2);
        fileOutputStream1.close();
        FileOutputStream fileOutputStream11 = new FileOutputStream(fileName1, true);
        fileOutputStream11.write(buffer3);
        fileOutputStream11.close();

    }
}
