package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService cashBack = new CashbackHackService();
        int amount = 900;

        int actual = cashBack.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
}