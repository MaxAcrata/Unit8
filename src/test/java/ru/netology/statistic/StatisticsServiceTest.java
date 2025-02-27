
package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StatisticsServiceTest {

    @Test
    public void findMaxFirstTest() {
        StatisticsService service = new StatisticsService();

        // Первый тестовый массив
        long[] sales = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        int expected = 12;

        // Находим максимальное значение
        long actual = service.findMax(sales);

        // Проверяем, что результат соответствует ожидаемому
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMaxSecondTest() {
        StatisticsService service = new StatisticsService();

        // Второй тестовый массив
        long[] sales = {12, 14, 16, 4, 5, 3, 8, 6, 11, 11, 12};
        int expected = 16;

        // Находим максимальное значение
        long actual = service.findMax(sales);

        // Проверяем, что результат соответствует ожидаемому
        Assertions.assertEquals(expected, actual);
    }
}