package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.kitchen.Waiter;

import java.util.Observer;

public class Restaurant {
    public static void main(String[] args) {
        Cook cook1 = new Cook("Amigo");
        Waiter waiter1 = new Waiter();
        cook1.addObserver(waiter1);

        Tablet tablet = new Tablet(5);
        tablet.addObserver(cook1);
        tablet.createOrder();

        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printCookWorkloading();
        directorTablet.printActiveVideoSet();
        directorTablet.printArchivedVideoSet();
    }
}
