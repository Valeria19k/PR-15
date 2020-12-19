package com.company;
import java.util.LinkedList;
public class Linked {
    public Linked() {

    }

    public void fill() {
        LinkedList<String> List2 = new LinkedList<>();
        System.out.println("Пополним коллекцию");
        List2.add("one");
        List2.add("two");
        List2.add("three");
        List2.add("four");
        List2.add("five");
        int size = List2.size();
        System.out.println("Размер: " + size);
        boolean a = List2.isEmpty();
        if (a == true) {
            System.out.println("Лист пустой");
        } else {
            System.out.println("Лист заполнен");
        }

        System.out.println(List2);
    }
}
