package com.sda.Fibonacci;

public class Task {
    public static void main(String[] args) {
        Task task = new Task();
        System.out.println(getFibonacciNumber(6));

        //System.out.println(getFibonacciNumber());
    }
    private static int getFibonacciNumber(int index) {
        int a = 0, b = 1;
        for (int i = 1; i <= index; i++) {
            b = b+a;
            a = b-a;

        }
        return a;
    }

}
