package com.sda.BMI;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in kg: ");
        float weight = scanner.nextFloat();
        System.out.println("Enter height in cm: ");
        int height = scanner.nextInt();
        System.out.println(BMI(weight, height));

    }
    private static String BMI(float weight, int height){
        float heightInm = height / 100.0f;
        float bmi = weight / (heightInm * heightInm);
        System.out.println(bmi);
        return  ( bmi < 18.5 || bmi > 24.9) ? "BMI nieoptymalne" : "BMI optymalne";


    }
}
