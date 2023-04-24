package org.example.DZ4.task1;

import java.util.LinkedList;
import java.util.Scanner;

//Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//Пример:
//1 -> 2->3->4
//Вывод:
//4->3->2->1
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int n = sc.nextInt();
        LinkedList<Integer> list = getList(n);
        System.out.println(list);
        System.out.println(reservList(list));
    }

    static LinkedList<Integer> getList(int n) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i < n; i++) {
            list.add(i);
        }
        return list;
    }

    static LinkedList<Integer> reservList(LinkedList<Integer> list) {
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            a = list.pollLast();
            list.add(i, a);
        }
        return list;
    }
}
