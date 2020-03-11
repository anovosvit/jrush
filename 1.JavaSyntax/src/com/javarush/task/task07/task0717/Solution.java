package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //read strings and init ArrayList list here - считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }
        ArrayList<String> result = doubleValues(list);
        // ArrayList<String> result = doubleValues(list);
        for (String s : result){
            System.out.println(s);
        }}
    public static ArrayList<String> doubleValues(ArrayList<String> list){
        for(int i = 0; i < list.size(); )
        {
            list.add(i, list.get(i));
            i+=2;
        }
        // add your code here - добавь код тут
        return list;
    }
}
