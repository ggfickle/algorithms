package com.hf;

public class Test {

    public static void main(String[] args) {
        int num = 7;
        print(num);
        print(num << 1);
        print(num >> 1);
        print(num >>> 1);
    }

    private static void print(int num) {
        System.out.println(num + "--" + Integer.toBinaryString(num));
    }
}
