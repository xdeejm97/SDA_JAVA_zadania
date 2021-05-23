package com.sda.Calculator;

public class Calculator {
    public static void main(String[] args) {
        calculate(1,'*', 6);

    }
    public static void calculate(float value1, char sign, float value2){
        float result;
        if (sign == '+'){
            result = value1 + value2;
        } else if (sign == '-'){
            result = value1 - value2;
        } else if (sign == '/'){
            if(value2 == 0 ){
                System.out.println("Cannot do this");
            }
            result = value1 / value2;
        } else if ( sign == '*'){
            result = value1 * value2;
        } else {
            System.out.println("Wrong sign");
            return;
        }
        System.out.println(result);
    }
}
