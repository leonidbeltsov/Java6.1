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
    void FindNumberLastMonthWithTheHighestSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int NumberLastMonthWithTheHighestSales = service.FindNumberLastMonthWithTheHighestSales(sales);
        assertEquals(expected, NumberLastMonthWithTheHighestSales);
    }


    @Test
        // Номер месяца, в котором был минимум продаж
    void FindNumberLastMonthWithTheLowestSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int NumberLastMonthWithTheHighestSales = service.FindNumberLastMonthWithTheLowestSales(sales);
        assertEquals(expected, NumberLastMonthWithTheHighestSales);
    }


    @Test
        // Кол-во месяцев, в которых продажи были ниже среднего
    void NumberOfMonthsWithBelowAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int NumberOfMonthsWithBelowAverageSales = service.NumberOfMonthsWithBelowAverageSales(sales);
        assertEquals(expected, NumberOfMonthsWithBelowAverageSales);
    }

    @Test
        // Кол-во месяцев, в которых продажи были выше среднего
    void NumberOfMonthsWithAboveAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int NumberOfMonthsWithAboveAverageSales = service.NumberOfMonthsWithAboveAverageSales(sales);
        assertEquals(expected, NumberOfMonthsWithAboveAverageSales);
    }

}