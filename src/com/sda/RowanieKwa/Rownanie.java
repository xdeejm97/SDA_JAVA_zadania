package com.sda.RowanieKwa;

import java.util.Scanner;

public class Rownanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza wartosc: ");
        int a = scanner.nextInt();
        System.out.println("Podaj druga wartosc: ");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecia wartosc: ");
        int c = scanner.nextInt();

        //System.out.println(results(a, b, c));


    }

    public static void results(int a, int b, int c) {
        double delta = b*b - 4*a*c;


    }

}
/*
public static void results1(int a, int b, int c){
double delta = b*b - 4*a*c;
if( delta >0){
double x1 = (-b - Math.sqrt(delta)) / 2 * a;
double x2 = (-b + Math.sqrt(delta)) / 2 * a;
sout("X1 = " + x1+", X2 = " + x2);
} else if( delta == 0){
double x1 = -b / 2 * a;
sout("X = " +delta);
}else {
sout("Delta ujemna");
}
*/



/*
private double x1;
private double x2;

public void setX1(double x1){
this.x1 = x1;
}
public void setX2(double x2){
this.x2 = x2;
}
public double getX1(){
return x1;
}
public double getX2(){
return x2;
}
public static zad3_rowaniekwa(int a, int b, int c){
double delta = b*b - 4*a*c;
if(delta >= 0){
zad3_rowaniekwa zad3 = new zad3_rowa();
double x1 = (-b - Math.sqrt(delta)) / 2 * a;
zad3.setX1(x1);
double x2 = (-b + Math.sqrt(delta)) / 2 * a;
zad3.setX2(x2);
return zad3;
}
else {
return null;
w psvm
zad3_... zad3 = getzad3_..(a, b ,c);
if ( zad3 == null){
sout("Delta ujemna")
}else {
sout("x1 = " + zad3_getX1() + "X2 = " +zad3_getX2())
 */

