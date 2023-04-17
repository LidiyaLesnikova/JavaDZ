package org.example.DZ1.task2;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных
        чисел, после которых следует отрицательное число.
        Пример ввода:
        1 2 1 2 -1 1 3 1 3 -1 0
        Логика расчета:
        2 -1 переход -> 2 в сумму
        3 -1 переход -> 3 в сумму
        Пример вывода: 5
        */

        System.out.printf("Сумма = %d",sumtDiff());
    }

    static int sumtDiff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers ");
        int a = scanner.nextInt();
        int sum = 0;
        while (a != 0) {
            int b = scanner.nextInt();
            if (a>0 && b<0) {
                sum+=a;
            }
            a = b;
        }
        scanner.close();
        return sum;
    }
}