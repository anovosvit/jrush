package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.awt.image.AreaAveragingScaleFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        scanner.close();

        FileInputStream fileInputStream = new FileInputStream(file1);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (fileInputStream.available() > 0){
            arrayList.add(0, fileInputStream.read());
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        for (int i = 0; i < arrayList.size(); i++){
            fileOutputStream.write(arrayList.get(i));
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
