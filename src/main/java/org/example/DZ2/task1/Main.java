package org.example.DZ2.task1;

import java.util.Scanner;

// Дана последовательность N целых чисел. Найти сумму простых чисел.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length sequence: ");
        int n = scanner.nextInt();
        System.out.printf("Сумма простых чисел в %d-последовательности = %s",n,getSumSimpleNumbers(n));
        scanner.close();
    }

    static String getSumSimpleNumbers(int n) {
        int sumSimpleNumbers = 0;
        String rez = "(";
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i%j==0) count++;
            }
            if (count == 1) {
                sumSimpleNumbers+= i;
                rez+= i + "+";
            }
        }
        rez = rez.substring(0, rez.length()-1)+") = "+sumSimpleNumbers;
        return rez;
    }
}