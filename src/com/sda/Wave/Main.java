package com.sda.Wave;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a lenght wave's: ");
        int numberWave = scanner.nextInt();
        drawWave(numberWave);
        drawWave1(numberWave);

    }

    private static void drawWave(int lenght) {
        String[] elements = {"*      *", " *    * ", "  *  *  ", "   **   "};
        for (int i = 0; i < elements.length; i++) {
            for (int j =0 ; j < lenght; j++) {
                System.out.print(elements[i]);
            }
            System.out.println();
        }
    }
    private static void drawWave1(int lenght){
        String[] elements = {"*      *", " *    * ", "  *  *  ", "   **   "};
        for (String element : elements){
            System.out.println(element.repeat(lenght));
        }
        System.out.println();
    }
}