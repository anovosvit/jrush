package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sFirst = br.readLine();
        String sSecond = br.readLine();
        String sThird = br.readLine();
        int nFirst = Integer.parseInt(sFirst);
        int nSecond = Integer.parseInt(sSecond);
        int nThird = Integer.parseInt(sThird);
        System.out.println(middleNumber(nFirst, nSecond, nThird));

    }

    public static int middleNumber(int a, int b, int c)
    {
        int tmp;
        if (a > b)
        {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (b > c)
        {
            b = c;
        }
        if (a > b)
        {
            b = a;
        }
        return b;
    }
}
