package com.example.ontap.Cap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(1, 1); //2
        int expected = 2; //2
        assertEquals(expected, result);
    }

    @Test
    void testTru() {
        assertEquals(2, calculator.tru(4, 2));
    }

    @Test
    void testNhan() {
        assertEquals(4, calculator.nhan(2, 2));
    }

    @Test
    void testChia() {
        assertEquals(1, calculator.chia(2, 2));
    }

    @Test
    public void testFail_ChiaCho0() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.chia(2, 0);
        });
    }

}