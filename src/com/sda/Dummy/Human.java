package com.sda.Dummy;

public class Human {

    public static int lastId = 1;

    private String name;
    private final  int id;

    public Human(String name){
        this.id = lastId++;
        this.name = name;
        //System.out.println("Hello world");
    }
    public void introduceYourself(){
        System.out.println("Hello, I'm " + name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
