package Ciag_najwiekszy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values =  collect10Integers();
        System.out.println(getAscendingSequenceLong(values));

    }
        public static int getAscendingSequenceLong(int[] array) {
            int count = 1;
            int maxLenght = 1;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i+1] > array[i]){
                    count++;
                } else {
                   if (maxLenght < count){
                       maxLenght = count;
                   }
                   count = 1;
                }
            }
            if(count > maxLenght){
                return count;
            }
            return maxLenght;
        }
        public static int[] collect10Integers () {
            System.out.println("Podaj 10 wartości: ");
            int[] result = new int[10];
            for (int i = 0; i < 10; i++) {
                result[i] = scanner.nextInt();
            }
            return result;
        }

    }


