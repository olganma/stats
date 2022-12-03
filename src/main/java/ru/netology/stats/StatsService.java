package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж
    public int sumSales(long[] sales) {
        int salesAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            salesAmount += sales[i];
        }
        return salesAmount;
    }

    // Средняя сумма продаж в месяц
    public int averageSumSales(long[] sales) {
        int avgSalesAmount = sumSales(sales) / sales.length;
        return avgSalesAmount;
    }

    // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSalesMonth(long[] sales) {
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

    // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // Количество месяцев, в которых продажи были ниже среднего
    public int qtyMonthBelowAvgSales(long[] sales) {
        int qtyLowSaleMonth = 0;
        long avgSalesAmount = averageSumSales(sales);
        for (long sale : sales) {
            if (sale < avgSalesAmount) {
                qtyLowSaleMonth++;
            }
        }
        return qtyLowSaleMonth;
    }

    // Количество месяцев, в которых продажи были выше среднего
    public int qtyMonthOverAvgSales(long[] sales) {
        int qtyHighSaleMonth = 0;
        long avgSalesAmount = averageSumSales(sales);
        for (long sale : sales) {
            if (sale > avgSalesAmount) {
                qtyHighSaleMonth++;
            }
        }
        return qtyHighSaleMonth;
    }
}


