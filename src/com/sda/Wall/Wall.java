package com.sda.Wall;

public class Wall {
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea(wall.width, wall.height));
        wall.setHeight(-1.5);
        System.out.println("width ="+ wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea(wall.width, wall.height));
    }
    private double width;
    private double height;
    private double area;

    public double getArea() {
        return area;
    }
    public Wall(int area) {
        this.area = area;
    }
    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        if ( width < 0){
            width = 0;
        }
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        if(height < 0){
            height= 0;
        }
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public static double getArea(double width, double height){
        return width * height;
    }
}

/*
Stwórz klasę Wall (ściana) z dwoma polami typu double width i height.
Klasa potrzebuje dwóch konstruktorów, jednego bezargumentowego, drugiego
z atrybutami width i height. W przyapdku, gdy ktoś podaje width lub height
mniejsze od 0, powinna być ustawiana domyślna wartość 0 dla odpowiedniego
pola.
Napisz następujące metody:
- getWidth - metoda bezargumentowa , zwracająca wartość pola width
- getHeight - metoda bezargumentowa, zwracająca wartość pole height
- setWidth - z jednym argumentem typu double, powinna ustawiać wartość pola
	     width. Jeśli parametr będzie mniejszy od 0, powinna ustawiać
	     się wartość 0.
- setHeight- z jednym argumentem typu double, powinna ustawiać wartość pola
	     height. Jeśli parametr będzie mniejszy od 0, powinna ustawiać
	     się wartość 0.
- getArea - metoda bezargumentowa
Przykład:
Wall wall = new Wall(5, 4);
System.out.println("area= " + wall.getArea());
wall.setHeight(-1.5);
System.out.println("width= " + wall.getWidth());
System.out.println("height= " + wall.getHeight());
System.out.println("area= " + wall.getArea());
---------
area= 20.0
width= 5.0
height= 0.0
area = 0.0
 */