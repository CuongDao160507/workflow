package com.example.ontap.Cap1;

public class SumArray {
    public int arr(int [] arr){
        if (arr == null) throw new IllegalArgumentException("Mang khong duoc null");

        int sum = 0;
        for (int num : arr) {
            if (num < 0 || num > 1000) throw new IllegalArgumentException("Khong nhan gia tri tu 0 den 1000");
            sum = sum + num;
        }
        return sum;
    }
}
