package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources= "/CashbackHackData.csv",numLinesToSkip=1)
    void shouldCalculateRemainOfAmount(int amount, int expectedResult, String message) {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actualResult = cashbackHackService.remain(amount);

        assertEquals(expectedResult, actualResult, message);
    }

    @Test
    void shouldReturnMessageIfAmountIsEquals0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(amount));
    }
    @Test
    void shouldReturnMessageIfAmountIsLower0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = -1;

        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(amount));
    }
}