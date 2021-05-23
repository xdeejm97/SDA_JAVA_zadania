package com.sda.Circle;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        float value = scanner.nextFloat();
        System.out.println(getCircumference(value));
    }
    private static float getCircumference(float diameter){
        return (float) (diameter * Math.PI);

    }
}
