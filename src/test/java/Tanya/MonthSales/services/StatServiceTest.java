package Tanya.MonthSales.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void testSalesSum() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test
    public void testAverageSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test

    public void testMaxSales() {
        StatService manager = new StatService();

        long[] sales = {12, 3, 22, 37, 8, 10, 13, 11, 21, 30, 14, 15};

        long actual = manager.maxSales(sales);
        long expected = 4;

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test

    public void testMinSales() {
        StatService manager = new StatService();

        long[] sales = {12, 3, 22, 37, 8, 10, 13, 11, 21, 30, 14, 15};

        long actual = manager.minSales(sales);
        long expected = 2;

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test

    public void testAboveAverageSales() {
        StatService manager = new StatService();

        long[] sales = {12, 3, 22, 37, 8, 10, 13, 11, 21, 30, 14, 15};

        long actual = manager.aboveAverage(sales);
        long expected = 4;

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test

    public void testUnderAverageSales() {
        StatService manager = new StatService();

        long[] sales = {12, 3, 22, 37, 8, 10, 13, 11, 21, 30, 14, 15};

        long actual = manager.avgLess(sales);
        long expected = 8;

        assertEquals(expected, actual);
        System.out.println(actual);
    }


}







