package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
//        if (clock.isAlive())
//        {
//            clock.interrupt();
//        }
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            for (int i = 0; i <= numSeconds; numSeconds--){
                if (numSeconds > 0) {
                    System.out.println(numSeconds);
                }
                else if (numSeconds == 0){
                    System.out.println("Марш!");
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    break;
                }

            }
        }
    }
}
