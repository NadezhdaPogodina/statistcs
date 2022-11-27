package ru.netology.stats.services;

public class StatsService {
    public int countSum(int[] sum) {
        int count = 0;

        for (int i = 0; i < 12; i++) {
            count = count + sum[i];
        }
        return count;
    }

    public int countAverageSales(int[] average) {
        int count = 0;
        int sumAverage = 0;

        for (int i = 0; i < average.length; i++) {

            count = (count + average[i]);
            sumAverage = count / average.length;
        }
        return sumAverage;
    }


    public int countMaxSales(int[] maxSales) {
        int maxMonth = 0;
        int monthNum = 0;

        for (int i = 0; i < 12; i++) {
            if (maxSales[maxMonth] > i) {
                maxMonth = monthNum;
            }
            monthNum = monthNum + 1;
        }
        return maxMonth;
    }


    public int countMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;

        for (int i = 0; i < 12; i++) {
            if (i <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int countMonths(int[] belowAverage) {
        int average = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < belowAverage.length; i++) {
            sum = sum + belowAverage[i];
        }
        average = sum / belowAverage.length;
        for (int i = 0; i < belowAverage.length; i++) {
            if (belowAverage[i] < average) {
                count = count + 1;
            }
        }
        return count;
    }


    public int numberMonths(int[] aboveAverage) {
        int sum = 0;
        int average = 0;
        int count = 0;

        for (int i = 0; i < aboveAverage.length; i++) {
            sum = sum + aboveAverage[i];
        }

        average = sum / aboveAverage.length;

        for (int i = 0; i < aboveAverage.length; i++) {
            if (aboveAverage[i] > average) {
                count = count + 1;
            }
        }
        return count;
    }
}