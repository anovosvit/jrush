package com.javarush.task.task15.task1522;

public class Sun implements Planet {
//    private Sun() {
//    }
//
//    private static class lazyHolder {
//        static final Sun INSTANCE = new Sun();
//    }
//
//    public static Sun getInstance(){
//        return lazyHolder.INSTANCE;
//    }

    private static Sun instance;
    private Sun(){
    }
    public static Sun getInstance(){
        if(instance==null)instance=new Sun();
        return instance;
    }
}
