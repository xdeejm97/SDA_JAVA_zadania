package com.sda.Jakałka;

import java.util.Scanner;

public class Stutter {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Write a sentence");
        String sentence = scanner.nextLine();
        System.out.println(getStutter(sentence));
    }

    private static String getStutter(String sentence1) {
       String [] words = sentence1.split(" ");
       StringBuilder stringBuilder = new StringBuilder();
       for (String element : words){
           //stringBuilder.append(element).append(" ").append(element).append(" ");
            stringBuilder.append(element.concat(" ").repeat(2));
       }
       return stringBuilder.toString();
    }
}