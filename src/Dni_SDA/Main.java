package Dni_SDA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Podaj datę następnego spotkania w SDA: yyyy-mm-dd");
        String dateClasses = scanner.next();
        System.out.println("Do nastepnych zajec pozostalo " + getcountDay(dateClasses) + " dni");
    }
    private static long getcountDay(String date){
        LocalDate localDate = LocalDate.parse(date);
        LocalDate now = LocalDate.now();

        return ChronoUnit.DAYS.between(now, localDate);

    }
}
