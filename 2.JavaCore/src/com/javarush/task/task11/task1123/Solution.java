package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

//        for (int i = 0; i < inputArray.length; i++) {
//            for (int j = 0; j < inputArray.length - 1; j++) {
//                if (inputArray[j] > inputArray[i]) {
//                    int a = inputArray[i];
//                    inputArray[i] = inputArray[j];
//                    inputArray[j] = a;
//                }
//            }
//        }

            // напишите тут ваш код
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int a : inputArray){
            if (a > max) {
                max = a;
            }
            if (a < min){
                min = a;
            }
        }


            return new Pair<Integer, Integer>(min, max);

    }

    public static class Pair <X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
