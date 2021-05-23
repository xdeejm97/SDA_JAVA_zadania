package com.sda.Listy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String[] strings = {"Abc", "Cde",};

        List<String> list = new ArrayList(List.of("zzz", "yyy"));
        list.add("Abc");
        list.add("Cde");
        list.add("Efg");



        System.out.println(list.get(1).toLowerCase(Locale.ROOT));
        List<Integer> integers = new ArrayList<>();


        String [] array = {"abc", "cde", "efg"};
        System.out.println(array[1]);
     // for (String value : array){
     //     if ("cde".equals(value)){
     //         System.out.println("Mamy cde");
     //     }

     // }
     // System.out.println("Nie mamy cde");

     // System.out.println(list.contains("Cde"));

     // System.out.println(list.indexOf("Cde"));

     // list.remove("Cde");
     // System.out.println(list.toString());
    }
}
