package ru.netology.stats;

public class StatsService {

    int totalSalesAmount;        // Сумма продаж
    int meanSale;                // Значение средней продажи в месяц

    public int calculateTotalSalesAmount(int[] sales) {     //Сумма всех продаж
        totalSalesAmount = 0;
        for (int delta : sales) {
            totalSalesAmount += delta; // равнозначно totalSalesAmount = totalSalesAmount + delta
        }
        return totalSalesAmount;
    }


    public int calculateMeanSale(int[] sales) {     // Среднемесячная продажа
        int totalSalesAmount = calculateTotalSalesAmount(sales);
        meanSale = totalSalesAmount / sales.length;
        return meanSale;
    }


    public int FindNumberLastMonthWithTheHighestSales(int[] sales) {        // Номер месяца, в котором был пик продаж
        int maxSale = sales[0];     // Значение наивысших продаж
        int i = 0;
        int iMax = 0;               // Номер месяца, в котором был пик продаж
        for (int sale : sales) {
            if (maxSale < sale) {
                maxSale = sale;
            }
        }

        for (int sale : sales) {
            if (sale != maxSale) {
                i = i + 1;
            } else {
                i = i + 1;
                iMax = i;
            }
        }
        return iMax;
    }


    public int FindNumberLastMonthWithTheLowestSales(int[] sales) {        // Номер месяца, в котором был минимум продаж
        int minSale = sales[0];     // Значение наименьших продаж
        int i = 0;
        int iMin = 0;               // Номер месяца, в котором был минимум продаж
        for (int sale : sales) {
            if (minSale > sale) {
                minSale = sale;
            }
        }

        for (int sale : sales) {
            if (sale != minSale) {
                i = i + 1;
            } else {
                i = i + 1;
                iMin = i;
            }
        }
        return iMin;
    }


    public int NumberOfMonthsWithBelowAverageSales(int[] sales) {
        int i = 0;
//        totalSalesAmount = 0;
//        for (int delta : sales) {
//            totalSalesAmount += delta;
//            meanSale = totalSalesAmount / sales.length;
//        }
// Ибо учат нас быть ленивыми и экономными программистами, мы не будет считать по новой значение средней продажи и
// отдадим эту честь нашему сервису, написанному выше.
        meanSale = calculateMeanSale(sales);
        for (int sale : sales) {
            if (meanSale > sale) {
                i = i + 1;
            }
        }
        return i;
    }


    public int NumberOfMonthsWithAboveAverageSales(int[] sales) {
        int i = 0;
        meanSale = calculateMeanSale(sales);
        for (int sale : sales) {
            if (meanSale < sale) {
                i = i + 1;
            }
        }
        return i;
    }
}