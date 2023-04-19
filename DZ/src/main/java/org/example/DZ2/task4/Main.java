package org.example.DZ2.task4;

import java.util.Arrays;

 Отвалидировать доску судоку
         /Требования
         Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
         1. Каждая строка должна содержать цифру 1-9 без повторения
         2. Каждая колонка должна содержать цифру 1-9 без повторения
         3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
         Ограничения
         • board.length == 9
         • board[i].length == 9
         • board[i][j] значение число или '.'
         */
public class Main {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Validete:" + isValidSudoku(board));  }

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 20, 4, -3, 16, 5, -3, 0, -4, 23};
        System.out.println(replaceArr(array));
    }

    static String replaceArr(int[] arr) {
        String list = Arrays.toString(arr);
        System.out.println(list);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>9 && arr[i]<100) {
                sum+=i;
            }
            if (arr[i]<0) {
                list = list.replace(String.valueOf(arr[i]),"XX");
            }
        }
        list = list.replaceAll("XX",String.valueOf(sum));
        return list;
    }
}