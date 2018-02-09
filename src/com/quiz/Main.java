package com.quiz;

import com.quiz.lib.MLinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Lindon");

        MLinkedList list = new MLinkedList();

        System.out.println("Append items into list!");
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        System.out.println(list.toString());

        System.out.println("Remove tail element from list");
        list.removeLast();
        System.out.println(list.toString());

        System.out.println("Remove all elements that are greater that 60");
        list.removeGreaterThan(60);
        System.out.println(list.toString());

    }
}
