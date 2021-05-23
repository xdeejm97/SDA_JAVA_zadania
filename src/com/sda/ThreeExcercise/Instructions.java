package com.sda.ThreeExcercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Instructions {
    public static void main(String[] args) {
        String[] tabPalindrom = {"kajak", "oko", "radar", "kobyła ma mały bok", "jacek"};
        String wordReverseOne = "abcd";
        int [] numbersTab = {1, 2 ,4 , 5, 7, 88, 99, 1, 4, 7, 8, 21, 44};

       // System.out.println(getPalindrom(tabPalindrom));
       // System.out.println(getPalindrom1(tabPalindrom));
       System.out.println(getWordReverse(wordReverseOne));
        //System.out.println(getTwoHighestValue(numbersTab));
    }

    //Zad1
    //  1) Napisz metodę, która przyjmuje jako argument tablice String'ów i zwraca ilość palindromów zawartych w tablice.
    //  Palindrom to wyraz lub zdania które czyta się tak samo od przodu jak i od tyłu np: kajak, oko, radar, kobyła ma mały bok.
    //  po zakończonym zadaniu, można spróbować przerobić metodę żeby zwracała nam listę palindromów.
    private static String getPalindrom(String[] tabPalindrom) {
        for (String word : tabPalindrom) {
            System.out.println(word);
            String textReverse = new StringBuilder(word).reverse().toString();
            System.out.println(textReverse);
        }
        return "";
    }
    private static String getPalindrom1(String[] tabPalindrom) {
        boolean isPalindrom;
        for (int i = 0; i < tabPalindrom.length; i++) {
            isPalindrom = true;
        }
        return "";
    }
    //Zad2
    //  2) Napisz funkcje, która przyjmuje jako argument tablica int'ów i zwraca tablicę zawierającą dwie najwyższe wartości.
    //  * po zakończonym zadaniu, można przerobić metodę aby zwracała obiekt przechowujący dwie wartości typu int
    private static int getTwoHighestValue(int[] numbersTab){
        int a = numbersTab[0];
        int b = 0;
        int[][] twoValue = new int[a][b];
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < numbersTab.length; i++) {
            if (numbersTab[i] > a) {
                a = numbersTab[i];


            }
        } return a;
    }
    //Zad3
    //  3) Napisz metodę, która jako argument przyjmuje obiekt typu String i odwraca kolejność znaków.
    //  Czyli np. przyjmuje wartość 'abcd', a zwraca 'dcba'.
    private static String getWordReverse(String wordReverseOne){
        String wordReverse = new StringBuilder(wordReverseOne).reverse().toString();
        System.out.println(wordReverseOne);
        return wordReverse;
    }
}
