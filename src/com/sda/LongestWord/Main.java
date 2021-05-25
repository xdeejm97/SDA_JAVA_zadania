package com.sda.LongestWord;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(findLongest());


    }
    private static String findLongest(){
        String word = scanner.nextLine();
        String longestWord = "";
        while(!"starczy".equalsIgnoreCase(word)){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
            word = scanner.next();
        }
        if ("".equals(longestWord)){
            return "Nie podano żadnego słowa";
        }else{
            return longestWord;
        }

    }


}