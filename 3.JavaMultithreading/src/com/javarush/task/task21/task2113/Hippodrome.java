package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private static List<Horse> horses = new ArrayList<>();

    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void move() {
        for (Horse a : horses){
            a.move();
        }
    }

    public void print(){
        for (Horse a : horses){
            a.print();
        }
        for (int i = 1; i <= 10; i++){
            System.out.println();
        }
    }

    public void run() throws InterruptedException {
        for (int i = 1; i<=100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    public Horse getWinner(){
        Horse winner = null;
        double distance = getHorses().get(0).getDistance();
        for (int i = 0; i < horses.size(); i++) {
            if (getHorses().get(i).getDistance() > distance){
                winner = getHorses().get(i);
                distance = winner.getDistance();
            }
        }

        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


    public static void main(String[] args) throws InterruptedException {
        Horse horse1 = new Horse("Saharok", 3, 0);
        Horse horse2 = new Horse("Morkovka", 3, 0);
        Horse horse3 = new Horse("Krasavchik", 3, 0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game = new Hippodrome(horses);

        game.run();
        game.printWinner();

    }
}