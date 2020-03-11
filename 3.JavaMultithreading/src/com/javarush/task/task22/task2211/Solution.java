package com.javarush.task.task22.task2211;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Смена кодировки
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        //String inFileName = "src/test/resources/level22/lesson13/task02/t1.txt";
        //String outFileName = "src/test/resources/level22/lesson13/task02/t2.txt";

        String inFileName = args[0];
        String outFileName = args[1];
        BufferedReader fReader = new BufferedReader(new InputStreamReader(new FileInputStream(inFileName), "Windows-1251"));
        List<String> lines = new ArrayList<>();
        while (fReader.ready()) {
            lines.add(fReader.readLine());
        }
        fReader.close();

        BufferedWriter fWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFileName), "UTF-8"));
        for (int i = 0; i < lines.size(); i++) {
            fWriter.write(lines.get(i));
            if (i != lines.size() - 1) {
                fWriter.newLine();
            }
        }
        fWriter.close();
    }
}