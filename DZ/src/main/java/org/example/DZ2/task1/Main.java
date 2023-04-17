package org.example.DZ2.task1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Given an input string s, reverse the order of the words

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scanner.nextLine();
        System.out.println(reservString(s));
        scanner.close();
    }

    /**
     *
     * @param str введенная пользователем строка
     * @return перевернутаястрока,
     */
    public static String reservString(String str) {
        String[] rez = str.trim().split(" ");
        String[] copy = new String[rez.length];
        int count = 0;
        for (int i = rez.length-1; i >= 0; i--) {
            copy[count] = rez[i];
            count++;
        }
        String rezult = "";
        for (int i = 0; i < copy.length; i++) {
            rezult = rezult.concat(copy[i]).concat(" ");
        }
        return rezult;
    }
}