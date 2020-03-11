package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Cook extends Observable implements Observer{
    private String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {
        ConsoleHelper.writeMessage("Start cooking - " + arg);
        Order order1 = (Order) arg;
        String tabletName = o.toString();
        String cookName = name;
        int cookingTimeSeconds = order1.getTotalCookingTime();
        List<Dish> cookingDishs = order1.getDishes();
        CookedOrderEventDataRow cookedOrderEventDataRow = new CookedOrderEventDataRow(tabletName, cookName,
                cookingTimeSeconds, cookingDishs);
        StatisticManager.getInstance().register(cookedOrderEventDataRow);

        setChanged();
        notifyObservers(arg);
    }
}
