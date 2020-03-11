package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            throw new IllegalArgumentException();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        BufferedReader fileBufReader = new BufferedReader(fileReader);

        String res;

        while((res = fileBufReader.readLine()) != null){
            if(res.startsWith(args[0] + " ")){
                System.out.println(res);
                break;
            }
        }

        reader.close();
        fileBufReader.close();
        fileBufReader.close();
    }
}
