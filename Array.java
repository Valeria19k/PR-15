package com.company;

import java.util.ArrayList;
public class Array {

    public Array() {

    }
    public void fill() {
        ArrayList<Integer> List = new ArrayList();
        System.out.println("Пополним коллекцию");
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        int size = List.size();
        System.out.println("Размер коллекции: " + size);
        boolean a = List.isEmpty();
        if (a == true) {
            System.out.println("Лист пустой");
        } else {
            System.out.println("Лист заполнен");
        }

        System.out.println(List);
    }
}
