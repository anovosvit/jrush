package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> num3 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 20; i++){
            list.add(scanner.nextInt());
            if(list.get(i)%3 == 0 && list.get(i)%2 ==0){
                num3.add(list.get(i));
                num2.add(list.get(i));
            }
            else if (list.get(i)%3 == 0){
                num3.add(list.get(i));
            }
            else if(list.get(i)%2 == 0){
                num2.add(list.get(i));
            }
            else {
                other.add(list.get(i));
            }

        }

        printList(list);
        printList(num3);
        printList(num2);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
