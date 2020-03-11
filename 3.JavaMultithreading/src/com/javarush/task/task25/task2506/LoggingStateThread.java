package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{
    Thread target;


    public LoggingStateThread(Thread target) {
        this.target = target;
    }

    @Override
    public void run() {
        Thread.State currentState = target.getState();
        System.out.println(currentState);
        super.run();
        while (!currentState.equals(State.TERMINATED)) {
            Thread.State newState = target.getState();
            if (!newState.equals(currentState)) {
                System.out.println(newState);
                currentState = newState;
            }
        }
        this.interrupt();
    }
}
