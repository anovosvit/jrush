package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void makeListOfFiles(String directoryName, List<File> files) {
        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        if(fList != null)
            for (File file : fList) {
                if (file.isFile()&&file.length()<=50) {
                    files.add(file);
                } else if (file.isDirectory()) {
                    makeListOfFiles(file.getAbsolutePath(), files);
                }
            }
    }
    public static void main(String[] args) throws Exception {
        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);
        FileUtils.deleteFile(resultFileAbsolutePath);
        ArrayList<File> fileList = new ArrayList<>();
        File path = new File(args[0]);
        try (FileOutputStream fileOutputStream = new FileOutputStream(allFilesContent)) {
            makeListOfFiles(path.getAbsolutePath(), fileList);
            Collections.sort(fileList);
            for (File file : fileList) {
                FileInputStream fileInputStream = new FileInputStream(file);
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read());
                }
                fileOutputStream.write(System.lineSeparator().getBytes());
                fileOutputStream.flush();
                fileInputStream.close();
            }
        }
    }
}