package com.example.ontap.Cap1;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int tru(int a, int b) {
        return a-b;
    }
    public int nhan(int a, int b){
        return a * b;
    }
    public int chia(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Khong chia duoc cho 0");
        }
        return a / b;
    }

}
