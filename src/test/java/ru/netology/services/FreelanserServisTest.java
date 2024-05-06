package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelanserServisTest {
    @Test
    public void testCalculate1() {
        FreelanserServis servis = new FreelanserServis();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int actual = servis.calculate(income, expenses, threshold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

        @Test
        public void testCalculate2() {
            FreelanserServis servis = new FreelanserServis();
            int income = 100_000;
            int expenses = 60_000;
            int threshold = 150_000;

            int actual = servis.calculate(income, expenses, threshold);
            int expected = 2;

            Assertions.assertEquals(expected, actual);
        }

}