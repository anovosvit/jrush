package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader file = new BufferedReader(new FileReader(fileName));
        StringBuffer str = new StringBuffer();
        while (file.ready())
        {
            str.append(file.readLine());
        }
        String l = str.toString().replaceAll("\r\n","");
        if (!l.contains("CDATA"))
        {
            findTags(args[0], l, 0);
        }
        file.close();

    }

    public static void findTags(String tag, String x, int q)
    {
        int howManyTag = 0, lastTagsIndex = 0;
        int i = q;
        while (i < (x.length() - tag.length() - 1))
        {
            if (x.substring(i, i + tag.length() + 1).equals("<" + tag))
            {
                if (howManyTag == 0) lastTagsIndex = i;
                howManyTag++;
            }
            else if (x.substring(i, i + tag.length() + 2).equals("</" + tag))
            {
                howManyTag--;
                if (howManyTag == 0)
                {
                    String newString = x.substring(lastTagsIndex, i + tag.length() +3);
                    System.out.println(newString);
                    findTags(tag, newString, 1);
                }
            }
            i++;
        }
    }
}
