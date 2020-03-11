package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.ad.AdvertisementStorage;
import com.javarush.task.task27.task2712.ad.NoVideoAvailableException;
import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.NoAvailableVideoEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet extends Observable {
    private final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder(){
        Order newOrder = null;

        try {
            newOrder = new Order(this);
            if (!newOrder.isEmpty()) {
                setChanged();
                notifyObservers(newOrder);

                AdvertisementManager manager = new AdvertisementManager(newOrder.getTotalCookingTime());
                StatisticManager.getInstance().register(new VideoSelectedEventDataRow(AdvertisementStorage.getInstance().videos, 0, 0));
                manager.processVideos();
            }

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        }
        catch (NoVideoAvailableException ex){
            StatisticManager.getInstance().register(new NoAvailableVideoEventDataRow(newOrder.getTotalCookingTime()*60));
            logger.log(Level.INFO, String.format("No video is available for the order " + newOrder));
        }
        return newOrder;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                "}";
    }

}
