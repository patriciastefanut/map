package org.example;

public class NumberArrayUtils {
    //maximale Zahl
    public int findMax(int[] numbers) throws Exception {
        if (numbers.length == 0) {
            throw new Exception("Array is empty!");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    //minimale Zahl
    public int findMin(int[] numbers) throws Exception {
        if (numbers.length == 0) {
            throw new Exception("Array is empty!");
        }
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    //maximale Summe von n-1 Zahlen
    public int findMaxSumOfNMinusOne(int[] numbers) throws Exception {
        if (numbers.length == 0) {
            throw new Exception("Array is empty!");
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
        }

        return sum - min;
    }

    //minimale Summe von n-1 Zahlen
    public int findMinSumOfNMinusOne(int[] numbers) throws Exception {
        if (numbers.length == 0) {
            throw new Exception("Array is empty!");
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }
        }
        return sum - max;
    }
}
