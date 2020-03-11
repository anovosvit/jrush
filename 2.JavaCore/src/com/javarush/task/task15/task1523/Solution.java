package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    int a;
    String b;

    public Solution() {
    }

    private Solution(int a) {
    }

    Solution(int a, String b){}

    protected Solution(String b){}

    public static void main(String[] args) {

    }
}

