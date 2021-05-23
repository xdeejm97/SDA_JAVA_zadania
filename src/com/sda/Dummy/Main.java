package com.sda.Dummy;

public class Main {
    public static void main(String[] args) {
        System.out.println(Dummy.isGreaterThan5(10));

        System.out.println(Math.PI);


        Dummy dummy = new Dummy();
        System.out.println(dummy.isGreaterThan10(11));

        Human human = new Human("Kuba");
        Human human1 = new Human("Andrzej");
        System.out.println(human.getName() + " " + human.getId());
        System.out.println(human1.getName() + " " + human.getId());
    }
}
