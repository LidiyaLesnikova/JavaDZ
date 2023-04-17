package org.example.DZ2.task2;

import java.util.Scanner;

// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length sequence: ");
        int n = scanner.nextInt();
        System.out.printf("Последовательность из %d чисел: %s",n,proof(n));
        scanner.close();
    }

    static String proof(int n) {
        Boolean priznak = true;
        int a, b;

        a = (int)(Math.random()*100);
        String rez = ""+a+", ";
        while (n > 1) {
            b = (int)(Math.random()*100);
            if (a>b) priznak = false;
            n-=1;
            rez += b + ", ";
            a = b;
         }
        rez = rez.substring(0, rez.length()-2)+(priznak ? " - возрастающая" : " - не возрастающая");
        return rez;
    }
}