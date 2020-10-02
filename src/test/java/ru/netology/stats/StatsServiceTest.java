package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    public long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public StatsService service = new StatsService();

    @Test
    void calculateSum() {
        //long expected = 180;
        //long actual = service.calculateSum(purchases);

        assertEquals(180, service.calculateSum(purchases));
    }

    @Test
    void findMax() {
        //long expected = 8;
        //long actual = service.findMax(purchases);

        assertEquals(8, service.findMax(purchases));
    }


    @Test
    void minFind() {
        //long expected = 8;
        //long actual = service.minFind(purchases);

        assertEquals(8, service.minFind(purchases));
    }

    @Test
    void middleValue() {
        //long expected = 15;
        //long actual = service.middleValue(purchases);

        assertEquals(15, service.middleValue(purchases));
    }

    @Test
    void countMaxMiddleValue() {
        //long expected = 5;
        //long actual = service.middleValue(purchases);

        assertEquals(5, service.maxMiddleValue(purchases));
    }

    @Test
    void countMinMiddleValue() {
        //long expected = 15;
        //long actual = service.middleValue(purchases);

        assertEquals(5, service.minMiddleValue(purchases));
    }
}