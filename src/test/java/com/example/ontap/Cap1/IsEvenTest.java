package com.example.ontap.Cap1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsEvenTest {
    IsEven isEven;

    @BeforeEach
    public void setUp() {
        isEven = new IsEven();
    }

    @Test
    public void testIsEvenTrue() {
        assertTrue(isEven.isEven(2));
    }

    @Test
    public void testIsEvenFalse() {
        assertFalse(isEven.isEven(1));
    }

    @Test
    public void testIsEven() {
        assertEquals(true,isEven.isEven(2));
    }

    @Test
    public void testIsEvenException() {
        assertThrows(IllegalArgumentException.class, () -> {
            isEven.isEven(-1);
        });
    }

    @AfterEach
    public void  tearDown() {
        isEven = null;
    }

}