package com.example.ontap.Cap1;

public class IsEven {
    public boolean isEven(int n) {
        if (n < 0) throw new IllegalArgumentException("Khong kiem tra so am");
        return n % 2 == 0;
    }

}
