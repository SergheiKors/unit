package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldAdvicePayExtraUntilLimit() {
        CashbackHackService cashBack = new CashbackHackService();
        int amount = 999;

        int actual = cashBack.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdvicePayExtraOverLimit() {
        CashbackHackService cashBack = new CashbackHackService();
        int amount = 1001;

        int actual = cashBack.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNoAdvicePayExtra() {
        CashbackHackService cashBack = new CashbackHackService();
        int amount = 1000;

        int actual = cashBack.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}