package org.example.DZ2.task4;

import java.util.Arrays;

/* Отвалидировать доску судоку
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

    static Boolean isValidSudoku(char[][] board) {
        Boolean validate = true;
        if (board.length!=9) {
            validate = false;
        } else {
            char[] numbers = new char[] {'0','1','2','3','4','5','6','7','8','9'};
            for (int i = 0; i < board.length && validate == true; i++) { //строки
                if (board[i].length!=9) {
                    validate = false;
                }
                else {
                    long chek = new String(board[i]).chars().filter(ch -> ch != '.' && ch!=numbers[(int)ch-48]).count();
                    if (chek != 0) {
                        validate=false;
                    } else {
                        validate = validateArray(board[i]);
                    }
                }
            }

            for (int i = 0; i < board.length && validate == true; i++) { //колонки
                char[] column = new char[board[i].length];
                for (int j = 0; j < board[i].length; j++) {
                    column[j] = board[j][i];
                }
                validate = validateArray(column);
            }

            for (int i = 0; i < 3 && validate == true; i++) { //блоки 3х3
                for (int l = 0; l < 3; l++) {
                    char[] block = new char[board.length];
                    int count = 0;
                    for (int j = 3*i; j < 3*(i+1); j++) {
                        for (int k = 3*l; k < 3*(l+1); k++) {
                            block[count] = board[j][k];
                            count++;
                        }
                    }
                    validate = validateArray(block);
                }
            }
        }
        return validate;
    }

    private static boolean validateArray(char[] chars) {
        Boolean validate = true;
        char[] temp = chars.clone();
        Arrays.sort(temp);
        for (int i = 0; i < temp.length-1; i++) {
            if (temp[i] != '.') {
                if (temp[i]==temp[i+1]) {
                    validate = false;
                }
            };
        }
        return validate;
    }

}