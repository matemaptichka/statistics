package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calcLessAverage(int[] sales) {
        int average = findAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count += 1;
            }

        }
        return count;
    }

    public int calcMoreAverage(int[] sales) {
        int average = findAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count += 1;
            }

        }
        return count;
    }

}