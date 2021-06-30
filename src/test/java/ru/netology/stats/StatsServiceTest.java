package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    // Да будет объявлен массив продаж по месяцам прямо тут, дабы сократить количество строк кода.
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
        //Сумма всех продаж
    void calculateTotalSalesAmount() {
        StatsService service = new StatsService();
        int expected = 180;
        int totalSalesAmount = service.calculateTotalSalesAmount(sales);
        assertEquals(expected, totalSalesAmount);
    }


    @Test
        // Среднемесячная продажа
    void calculateMeanSale() {
        StatsService service = new StatsService();
        int expected = 15;
        int meanSale = service.calculateMeanSale(sales);
        assertEquals(expected, meanSale);
    }


    @Test
        // Номер месяца, в котором был пик продаж
    void findNumberLastMonthWithTheHighestSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int numberLastMonthWithTheHighestSales = service.findNumberLastMonthWithTheHighestSales(sales);
        assertEquals(expected, numberLastMonthWithTheHighestSales);
    }


    @Test
        // Номер месяца, в котором был минимум продаж
    void findNumberLastMonthWithTheLowestSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int numberLastMonthWithTheHighestSales = service.findNumberLastMonthWithTheLowestSales(sales);
        assertEquals(expected, numberLastMonthWithTheHighestSales);
    }


    @Test
        // Кол-во месяцев, в которых продажи были ниже среднего
    void numberOfMonthsWithBelowAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int numberOfMonthsWithBelowAverageSales = service.numberOfMonthsWithBelowAverageSales(sales);
        assertEquals(expected, numberOfMonthsWithBelowAverageSales);
    }

    @Test
        // Кол-во месяцев, в которых продажи были выше среднего
    void numberOfMonthsWithAboveAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int numberOfMonthsWithAboveAverageSales = service.numberOfMonthsWithAboveAverageSales(sales);
        assertEquals(expected, numberOfMonthsWithAboveAverageSales);
    }

}