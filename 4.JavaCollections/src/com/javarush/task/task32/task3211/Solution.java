package com.javarush.task.task32.task3211;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* 
Целостность информации
*/

public class Solution {
    public static void main(String... args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new String("test string"));
        oos.flush();
        System.out.println(compareMD5(bos, "5a47d12a2e3f9fecf2d9ba1fd98152eb")); //true

    }

    public static boolean compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) throws Exception {
        MessageDigest md = null;
            md = MessageDigest.getInstance("MD5");
            md.update(byteArrayOutputStream.toByteArray());
        String s2 = new BigInteger(1,md.digest()).toString(16);
        //дополняем нулями до 32 символов, в случае необходимости
        while(s2.length() < 32 ){
            s2 = "0"+s2;
        }
        //возвращаем MD5-хеш
        return md5.equals(s2);
    }
}
