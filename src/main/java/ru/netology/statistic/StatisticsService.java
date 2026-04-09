package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long max = incomes[0];
        for (long income : incomes) {
            if (income > max) {
                max = income;
            }
        }
        return max;
    }
}
