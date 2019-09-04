package com.millioners;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class PrizeSumTest {
    @Test
    public void shouldReturnMapValue10_000WhenMapKeyEquals2() {
        //when
        Map<Integer, String> prize = PrizeSum.prizeValues();
        String value = prize.get(2);

        //then
        Assert.assertEquals("Wygrałeś 10 000 zł !", value);
    }
    @Test
    public void shouldReturnMapValue1_000WhenMapKeyEquals1() {
        //when
        Map<Integer, String> prize = PrizeSum.prizeValues();
        String value = prize.get(1);

        //then
        Assert.assertEquals("Wygrałeś 1 000 zł !", value);
    }
    @Test
    public void shouldReturnMapValue100_000WhenMapKeyEquals4() {
        //when
        Map<Integer, String> prize = PrizeSum.prizeValues();
        String value = prize.get(4);

        //then
        Assert.assertEquals("Wygrałeś 100 000 zł !", value);
    }
}
