package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return bufferedReader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishes = new ArrayList<>();

        while (true) {
            writeMessage("Выберите блюдо:");
            writeMessage(String.format("- %s", Dish.Fish));
            writeMessage(String.format("- %s", Dish.Steak));
            writeMessage(String.format("- %s", Dish.Soup));
            writeMessage(String.format("- %s", Dish.Juice));
            writeMessage(String.format("- %s", Dish.Water));
            writeMessage("exit");

            String menuPosition = readString();
            if (menuPosition.toLowerCase().equals("exit")){
                writeMessage("Заказ окончен.");
                break;
            }

            try {
                dishes.add(Dish.valueOf(menuPosition));
                writeMessage("Блюдо добавлено в заказ");
            } catch (Exception e) {
                writeMessage("Такого блюда нет в меню");
            }
        }
        return dishes;
    }
}
