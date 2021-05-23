package com.sda.PercentSpace;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Write some text");
        String text = scanner.nextLine();
        System.out.println(getPercentOfSpaces(text) + " %");

    }
//    private static float getPercentOfSpaces(String text1){
//        char [] words = text1.toCharArray();
//        int spaces = 0;
//        for(char letter : words){
//            if (letter == ' '){
//                spaces ++;
//            }
//        }
//        return (float) spaces / text1.length() * 100;
//    }

    private static float getPercentOfSpaces(String text1){
        String textWithoutSpaces = text1.replaceAll("\\s", "");
        System.out.println(textWithoutSpaces);
        return ((text1.length() - textWithoutSpaces.length()) / (float)text1.length() * 100);
    }
}
