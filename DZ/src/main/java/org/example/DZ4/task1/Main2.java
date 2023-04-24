package org.example.DZ4.task1;

import java.util.Scanner;
import java.util.Stack;

//Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//Пример:
//1 -> 2->3->4
//Вывод:
//4->3->2->1
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int n = sc.nextInt();
        Stack<Integer> list = getList(n);
        System.out.println(list);
        System.out.println(reservList(list));
    }

    static Stack<Integer> getList(Integer n) {
        Stack<Integer> list = new Stack<>();
        for (int i = 1; i < n; i++) {
            list.add(i);
        }
        return list;
    }

    static String reservList(Stack<Integer> list) {
        String rez = "";
        for (int i = list.size()-1; i >= 0; i--) {
            rez += list.pop() + ", ";
        }
        return rez.substring(0,rez.length()-2);
    }
}
