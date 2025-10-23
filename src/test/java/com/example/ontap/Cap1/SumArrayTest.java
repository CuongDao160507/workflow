package com.example.ontap.Cap1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumArrayTest {
    SumArray sumArray;
    @BeforeEach
    void setUp() {
        sumArray = new SumArray();
    }

//    TuongDuong
    @Test
    public void tuongDuong_testSumArrayTrue() {
        int [] arr = {3,4,5,6};
        assertEquals(18, sumArray.arr(arr));
    }

    @Test
    public void tuongDuong_testSumArrayFalse() {
        assertThrows(IllegalArgumentException.class, () -> {
            int [] arr = {-3, -4, -5};
            sumArray.arr(arr);
        });
    }

    //Bien
    @Test
    public void bienDuoi_testSumArray() {
        assertEquals(7, sumArray.arr(new int[]{0,4,3}));
    }

    @Test
    public void TrenBienDuoi_testSumArray() {
        assertEquals(8, sumArray.arr(new int[]{1,4,3}));
    }

    @Test
    public void DuoiBienDuoi_testSumArrayFalse() {
        assertThrows(IllegalArgumentException.class, () -> {
            sumArray.arr(new int[]{-1, 6, 4});
        });
    }

    @Test
    public void bienTren_testSumArray() {
        assertEquals(1007, sumArray.arr(new int[]{1000,4,3}));
    }

    @Test
    public void DuoiBienTren_testSumArray() {
        assertEquals(1006, sumArray.arr(new int[]{999,4,3}));
    }

    @Test
    public void TrenBienDuoi_testSumArrayFalse() {
        assertThrows(IllegalArgumentException.class, () -> {
            sumArray.arr(new int[]{1001, 6, 4});
        });
    }

    @AfterEach
    void tearDown() {
        sumArray = null;
    }
}