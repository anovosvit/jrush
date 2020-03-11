package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
//        System.out.println(getTokens("level22.lesson13.task01", "."));
        getTokens("level22.lesson13.task01", ".");
    }
    public static String [] getTokens(String query, String delimiter) {
        ArrayList<String> a = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        while (stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken();
            a.add(token);
        }

        return a.toArray(new String[a.size()]);
    }
}
