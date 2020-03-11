package com.javarush.task.task27.task2712.statistic;
//singleton

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.util.*;

public class StatisticManager {
    private Set<Cook> cooks = new HashSet<>();
    private static StatisticManager instance = new StatisticManager();

    private StatisticStorage statisticStorage = new StatisticStorage();

    private StatisticManager() {
    }

    public static StatisticManager getInstance(){
        return instance;
    }

    public void register(EventDataRow data){
        statisticStorage.put(data);
    }

    public void register(Cook cook){
        cooks.add(cook);
    }

    private class StatisticStorage {
        Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        public StatisticStorage() {
            EventType[] eventTypes = EventType.values();
            for (int i = 0; i < eventTypes.length; i++) {
                storage.put(eventTypes[i], new ArrayList<EventDataRow>());
            }
            register(new Cook("dsdsds"));
        }

        private void put(EventDataRow data){
            storage.get(data.getType()).add(data);
        }

        public Map<EventType, List<EventDataRow>> getStorage() {
            return storage;
        }
    }

    public Map<Date, Double> amountPerDay() {
        Map<Date, Double> result = new TreeMap<>(Collections.reverseOrder());
        List<EventDataRow> eventDataRowList = statisticStorage.getStorage().get(EventType.SELECTED_VIDEOS);
        double amount;
        Date date;
        Calendar calendar;
        for (EventDataRow eventDataRow : eventDataRowList) {
            VideoSelectedEventDataRow adVideo = (VideoSelectedEventDataRow) eventDataRow;
            amount = adVideo.getAmount() / 100.0;
            calendar = Calendar.getInstance();
            calendar.setTime(adVideo.getDate());
            GregorianCalendar gc = new GregorianCalendar(
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH)
            );
            date = gc.getTime();
            if (result.containsKey(date))
                amount += result.get(date);
            result.put(date, amount);
        }
        return result;
    }


    public Map<Date, Map<String, Integer>> cookLoading() {
        List<EventDataRow> eventDataRows = statisticStorage.getStorage().get(EventType.COOKED_ORDER);
        Map<Date, Map<String, Integer>> result = new TreeMap<>(Collections.reverseOrder());
        Date date;
        Calendar calendar;
        for (EventDataRow eventDataRow : eventDataRows) {
            CookedOrderEventDataRow cookedOrder = (CookedOrderEventDataRow) eventDataRow;
            calendar = Calendar.getInstance();
            calendar.setTime(cookedOrder.getDate());
            GregorianCalendar gc = new GregorianCalendar(
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH)
            );
            date = gc.getTime();
            if (result.containsKey(date)) {
                Map<String, Integer> cook = result.get(date);
                int value;
                if (cook.containsKey(cookedOrder.getCookName())) {
                    value = cook.get(cookedOrder.getCookName());
                    value += Math.toIntExact(Math.round(cookedOrder.getTime() / 60.0));
                } else {
                    value = Math.toIntExact(Math.round(cookedOrder.getTime() / 60.0));
                }
                cook.put(cookedOrder.getCookName(), value);
            } else {
                Map<String, Integer> cook = new TreeMap<>();
                cook.put(cookedOrder.getCookName(), Math.toIntExact(Math.round(cookedOrder.getTime() / 60.0)));
                result.put(date, cook);
            }
        }
        return result;
    }


}
