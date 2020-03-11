package com.javarush.task.task33.task3303;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

/* 
Десериализация JSON объекта
*/
public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
//        FileReader reader = new FileReader(fileName);
//        String jsonObj = "";
//        char c;
//        int i;
//        while (reader.ready()){
//            i = reader.read();
//            c = (char) i;
//            jsonObj = String.valueOf(c);
//        }

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(fileName),clazz);
    }

    public static void main(String[] args) throws IOException {

        @JsonAutoDetect
        class Cat{
            public String name;
            public int age;
            public Cat() {
            }
        }

        Class<Cat> clazz = Cat.class;

        convertFromJsonToNormal("1.txt", clazz);

    }
}
