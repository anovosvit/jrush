package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));

        while (reader1.ready()){
            list1.add(reader1.readLine());
        }

        while (reader2.ready()){
            list2.add(reader2.readLine());
        }

        reader1.close();
        reader2.close();

        int f1count = 0;
        int f2count = 0;
        String f11 = "";
        String f21 = "";
        String t1 = "";
        String t2 = "";
        while (f1count < list1.size() && f2count < list2.size()) {
            f11 = list1.get(f1count);
            f21 = list2.get(f2count);
            if (f11.equals(f21)) {
                lines.add(new LineItem(Type.SAME, f11));
                f1count++;
                f2count++;
                if (f1count == list1.size() && f2count != list2.size())
                    lines.add(new LineItem(Type.ADDED, list2.get(f2count)));
                if (f1count != list1.size() && f2count == list2.size())
                    lines.add(new LineItem(Type.REMOVED, list1.get(f1count)));
            } else {
                if (f1count < list1.size() - 1 && f2count < list2.size() - 1) {
                    t1 = list1.get(f1count + 1);
                    t2 = list2.get(f2count + 1);
                    if (f11.equals(t2)) {
                        lines.add(new LineItem(Type.ADDED, f21));
                        f2count++;
                    } else if (f21.equals(t1)) {
                        lines.add(new LineItem(Type.REMOVED, f11));
                        f1count++;
                    }
                } else if (f1count < list1.size() && f2count == list2.size()) {
                    lines.add(new LineItem(Type.REMOVED, f11));
                    lines.add(new LineItem(Type.SAME, f21));
                    f1count += 2;
                    f2count++;
                } else if (f1count == list1.size() && f2count < list2.size()) {
                    lines.add(new LineItem(Type.ADDED, f21));
                    lines.add(new LineItem(Type.SAME, f11));
                    f1count++;
                    f2count += 2;
                }
            }
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
