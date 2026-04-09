package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFindMaxWhenMaxAtBeginning() {
        long[] incomes = {12, 5, 8, 4};
        long expected = 12;
        StatisticsService service = new StatisticsService();
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindMaxWhenMaxAtEnd() {
        long[] incomes = {5, 8, 4, 12};
        long expected = 12;
        StatisticsService service = new StatisticsService();
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindMaxAllEqual() {
        long[] incomes = {7, 7, 7, 7};
        long expected = 7;
        StatisticsService service = new StatisticsService();
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindMaxSingleElement() {
        long[] incomes = {42};
        long expected = 42;
        StatisticsService service = new StatisticsService();
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findMaxWhenMaxAtEnd() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {10, 20, 30};
        long expected = 30;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}
