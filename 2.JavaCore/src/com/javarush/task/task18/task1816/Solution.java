package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int i;
        int count = 0;
//        HashMap<Integer, Character> hashMap = new HashMap<>();

        while((i = bufferedInputStream.read())!= -1){
            if ((int)i >= (int)'a' && (int)i <= (int)'z' || (int)i >= (int)'A' && (int)i <= (int)'Z') {
                count++;
//                if (!hashMap.containsValue((char) i)) {
//                    hashMap.put(i, (char) i);
//                }
            }
        }

        System.out.println(count);

        fileInputStream.close();
        bufferedInputStream.close();
    }
}
