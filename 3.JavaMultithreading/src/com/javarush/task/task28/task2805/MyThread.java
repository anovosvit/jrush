package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    private static volatile int count = 1;

    private void setCount(){
        if (count < 10) {
            setPriority(count);
            count++;
        }
        else {
            setPriority(count);
            count = 1;
        }
    }

    public MyThread() {
        setCount();
    }

    public MyThread(Runnable target) {
        super(target);
        setCount();

    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        setCount();

    }

    public MyThread(String name) {
        super(name);
        setCount();

    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        setCount();

    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        setCount();

    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        setCount();

    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        setCount();

    }

}
