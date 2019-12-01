package ru.netology.service;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmountIs1900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1900;

        int expectedResult = 100;
        int actualResult = cashbackHackService.remain(amount);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expectedResult = 0;
        int actualResult = cashbackHackService.remain(amount);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn200IfAmountIs800() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;

        int expectedResult = 200;
        int actualResult = cashbackHackService.remain(amount);

        assertEquals(expectedResult, actualResult);
    }

//    @Test
//    void shouldReturnMessageIfAmountIsLowerOrEquals0() throws IOException {
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 0;
//
//        String expectedResult = "amount must be greater than zero";
//        int actualResult = cashbackHackService.remain(amount);
//
//        Throwable thrown = assertThrows(IOException.class, () -> {
//            assertEquals(expectedResult, actualResult);
//        });
//                assertNotNull(thrown.getMessage());
//    }

    @Test
    void shouldReturnMessageIfAmountIsLowerOrEquals0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(amount));
    }
}