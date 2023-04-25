package org.example.DZ4.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

//Дана строку, s содержащая только символы '(', ')', '{', '}''[', ']', определите, является ли введенная строка корректной.
//
//Строка ввода корректна, если:
// открытые скобки должны быть закрыты скобками того же типа.
// открытые скобки должны быть закрыты в правильном порядке.
// каждой закрывающей скобке соответствует открывающая скобка того же типа.
public class Main {
    public static void main(String[] args) {
        System.out.println("'()' - "+isValid("()"));
        System.out.println("'()[]{}' - "+isValid("()[]{}"));
        System.out.println("'(]' - "+isValid("(]"));
        System.out.println("'([]{})' - "+isValid("([]{})"));
        System.out.println("'([]{)}' - "+isValid("([]{)}"));
    }

    static boolean isValid(String s) {
        List<String> standart = Arrays.asList("()" , "[]" , "{}");
        List<String> list = new ArrayList<>(List.of(s.split("")));
        int i = 0;
        while (i < list.size()-1) {
            if (standart.contains(list.get(i)+list.get(i+1))) {
                list.remove(i);
                list.remove(i);
                i = 0;
            } else {
                i++;
            }
        }
        return (list.size()==0) ? true : false;
    }
}
