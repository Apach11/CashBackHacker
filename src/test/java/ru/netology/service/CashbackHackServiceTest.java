package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashBackHackService service = new CashBackHackService();

    @Test
    public void shouldReturnNull() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn200() {
        int actual = service.remain(800);
        int expected = 200;
        Assert.assertEquals(actual, expected);
    }


    @Test
    void amountMoreBoundary() {
        int actual = service.remain(1_001);

        int expected = 999;

        Assert.assertEquals(actual, expected);
    }
}