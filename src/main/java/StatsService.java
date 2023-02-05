package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService {

    public int calculateSum(int @NotNull [] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public double calculateAverageSum(int[] purchases) {
        double sum = calculateSum(purchases);
        double averageSum = sum / purchases.length;
        return averageSum;
    }

    public int calculateMaxMonth(int @NotNull [] purchases) {
        int maxMonth = 0;
        for (int i = 1; i < purchases.length; i++) {

            if (purchases[maxMonth] <= purchases[i]) {
                maxMonth = i;
            }
        }

        maxMonth += 1;
        return maxMonth;
    }

    public int calculateMinMonth(int @NotNull [] purchases) {
        int minMonth = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[minMonth] >= purchases[i]) {
                minMonth = i;
            }
        }
        minMonth += 1;
        return minMonth;
    }

    public int calculateCounterUnderAverage(int[] purchases) {
        int counter = 0;
        double averageSum = calculateAverageSum(purchases);
        for (int purchase : purchases) {
            if (purchase < averageSum) {
                counter += 1;
            }
        }
        return counter;
    }

    public int calculateCounterUpperAverage(int[] purchases) {
        int counter = 0;
        double averageSum = calculateAverageSum(purchases);
        for (int purchase : purchases) {
            if (purchase > averageSum) {
                counter += 1;
            }
        }
        return counter;
    }
}