package org.example.DZ4.task2;

import java.util.LinkedList;
import java.util.Scanner;

//Дана строку, s содержащая только символы '(', ')', '{', '}''[', ']', определите, является ли введенная строка корректной.
//
//Строка ввода корректна, если:
// открытые скобки должны быть закрыты скобками того же типа.
// открытые скобки должны быть закрыты в правильном порядке.
// каждой закрывающей скобке соответствует открывающая скобка того же типа.
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
