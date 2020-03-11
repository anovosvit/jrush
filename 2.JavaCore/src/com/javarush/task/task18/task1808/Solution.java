package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        String file3 = scanner.nextLine();
        scanner.close();

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream file2OutputStream = new FileOutputStream(file2);
        FileOutputStream file3OutputStream = new FileOutputStream(file3);

        int size = fileInputStream.available();
        while (fileInputStream.available() > 0){
            int tmp = fileInputStream.read();
            if (fileInputStream.available() >= Math.floor(size/2)){
                file2OutputStream.write(tmp);
            }
            else {
                file3OutputStream.write(tmp);
            }
        }
        fileInputStream.close();
        file2OutputStream.close();
        file3OutputStream.close();

    }
}
