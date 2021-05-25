package ASCII;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        System.out.println(countDistance(a, b));

    }
    private static int countDistance(char ch1, char ch2) {
        //   if (ch2 > ch1) {
        //       return ch2 - ch1;
        //   } else {
        //       return ch1 - ch2;
        //   }
        return Math.abs(ch1 - ch2) -1 ;
    }
}
