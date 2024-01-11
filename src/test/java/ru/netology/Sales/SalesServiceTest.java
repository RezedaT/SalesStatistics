package ru.netology.Sales;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {

    @Test
    //сумма всех продаж
    public void shouldGetSum() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    //средняя сумма продаж
    public void shouldFindMidSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMidSales = 15;
        long actualMidSales = service.getMidSales(sales);

        Assertions.assertEquals(expectedMidSales, actualMidSales);
    }

    @Test
    //месяц с максимальной продажей
    public void shouldFindFirstMaxMonth() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMonth = 6;
        long actualMaxMonth = service.getFirstMaxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }
    @Test
    //месяц с максимальной продажей
    public void shouldFindLastMaxMonth() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMonth = 8;
        long actualMaxMonth = service.getLastMaxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    //месяц с минимальной продажей
    public void shouldFindMinMonth() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinMonth = 9;
        long actualMidMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMidMonth);
    }

    @Test
    //кол-во месяцев с продажами ниже среднего
    public void shouldFindMonthsBelowMid() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNum = 5;
        long actualNum = service.getMonthsBelowMid(sales);

        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    //кол-во месяцев с продажами выше среднего
    public void shouldFindMonthsAboveMid() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedNum = 5;
        long actualNum = service.getMonthsAboveMid(sales);

        Assertions.assertEquals(expectedNum, actualNum);
    }

}
