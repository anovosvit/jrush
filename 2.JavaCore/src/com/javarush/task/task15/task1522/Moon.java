package com.javarush.task.task15.task1522;

public class Moon implements Planet {
//    private Moon() {
//    }
//
//    private static class lazyHolder{
//        static final Moon INSTANCE = new Moon();
//    }
//
//    public static Moon getInstance(){
//        return lazyHolder.INSTANCE;
//    }
    private static Moon instance;
    private Moon(){
    }
    public static Moon getInstance(){
        if(instance==null)instance=new Moon();
        return instance;
    }
}
