package com.sda.PrimeNumbers;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Podaj dodatnia liczbe: ");
        int i = scanner.nextInt();
        System.out.println(getPrimeNumbers(i));
    }
    public static String getPrimeNumbers(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                stringBuilder.append(i).append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
