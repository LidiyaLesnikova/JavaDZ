package org.example.DZ3.task4;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getNumbers();
        System.out.println("Минимальное значение: "+numbers.stream().min(Integer::compare).get());
        System.out.println("Максимальное значение: "+numbers.stream().max(Integer::compare).get());
        System.out.println("Среднее значение списка: "+numbers.stream().mapToInt(a -> a).average().orElse(0));
    }

    static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов списка: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numbers.add((int)(Math.random()*100));
        }
        System.out.println(numbers);
        return numbers;
    }
}
