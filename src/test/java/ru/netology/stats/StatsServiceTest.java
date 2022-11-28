package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // Сумма всех продаж
    @Test
    public void shouldFindSalesSum() {
        StatsService service = new StatsService();
        long[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesSum = 180;
        int actualSalesSum = service.SumSales(salesTest);
        Assertions.assertEquals(expectedSalesSum, actualSalesSum);
    }

    // Средняя сумма продаж в месяц
    @Test
    public void shouldFindAverageSum() {
        StatsService service = new StatsService();
        long[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAvgSalesSum = 15;
        int actualAvgSalesSum = service.AverageSumSales(salesTest);
        Assertions.assertEquals(expectedAvgSalesSum, actualAvgSalesSum);
    }

    // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSalesMonth = 8;
        int actualMaxSalesMonth = service.maxSalesMonth(salesTest);
        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);
    }

    // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();
        long[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSalesMonth = 9;
        int actualMinSalesMonth = service.minSalesMonth(salesTest);
        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);
    }

    // Количество месяцев, в которых продажи были ниже среднего
    @Test
    public void shouldFindQtyMonthBelowAvgSales() {
        StatsService service = new StatsService();
        long[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQtyLowSaleMonth = 5;
        int actualQtyLowSaleMonth = service.QtyMonthBelowAvgSales(salesTest);
        Assertions.assertEquals(expectedQtyLowSaleMonth, actualQtyLowSaleMonth);
    }

    // Количество месяцев, в которых продажи были выше среднего
    @Test
    public void shouldFindQtyMonthOverAvgSales() {
        StatsService service = new StatsService();
        long[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQtyHighSaleMonth = 5;
        int actualQtyHighSaleMonth = service.QtyMonthOverAvgSales(salesTest);
        Assertions.assertEquals(expectedQtyHighSaleMonth, actualQtyHighSaleMonth);
    }

}
