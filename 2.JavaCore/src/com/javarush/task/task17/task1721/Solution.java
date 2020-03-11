package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        scanner.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        String line = null;
        while ((line = reader1.readLine()) != null)
        {
            allLines.add(line);
        }
        reader1.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(file2));
        String line1 = null;
        while ((line1 = reader2.readLine()) != null)
        {
            forRemoveLines.add(line1);
        }
        reader1.close();

//        FileReader reader2 = new FileReader(file2);
//        while ( reader2.read() != -1){
//            forRemoveLines.add(reader2.toString());
//        }
//        reader2.close();
//
        new Solution().joinData();
    }

    public void joinData() throws IOException, CorruptedDataException {


        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.removeAll(allLines);
            throw new CorruptedDataException();
        }
    }
}
