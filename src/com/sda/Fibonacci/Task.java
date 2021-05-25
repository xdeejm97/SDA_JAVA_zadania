package com.sda.Fibonacci;

public class Task {
    public static void main(String[] args) {
        Task task = new Task();
        System.out.println(getFibonacciNumber(7));
        System.out.println(getFibonacciNumberMethod2(6));

        //System.out.println(getFibonacciNumber());
    }

    private static int getFibonacciNumber(int index) {
        int a = 0, b = 1;
        for (int i = 1; i <= index; i++) {
            b = b + a;
            a = b - a;

        }
        return a;
    }

    private static int getFibonacciNumberMethod2(int index) {
        int value1 = 1;
        int value2 = 1;
        for (int i = 3; i <= index; i++) {
            int currentValue = value1 + value2;
            value1 = value2;
            value2 = currentValue;
        }
        return value2;
    }
}
