package com.company.java;


import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<Integer>();
        int count = 5;

        Set<Integer> numbers2 = new TreeSet<Integer>();
        int count2 = 2;

        System.out.println("________________________________________");

        while (numbers.size() < count) {
            numbers.add((int) (Math.random() * 50 + 1));
        }
        System.out.println("Wylosowane liczby 5 z 50 to : ");

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("________________________________________");



        while (numbers2.size() < count2) {
            numbers2.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Wylosowane liczby 2 z 10 to : ");

        for (Integer number : numbers2) {
            System.out.print(number + " ");

        }
    }
}


