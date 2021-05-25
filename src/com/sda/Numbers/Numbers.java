package com.sda.Numbers;

import java.util.Scanner;

public class Numbers {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a value: ");
        int number = sc.nextInt();
        System.out.println(countDigitsSun(number));
    }
    private static int countDigitsSun(int number) {
        int result = 0;
        while(number != 0){
            result += number %10;
            number /= 10;
        }
        return Math.abs(result);
    }
}