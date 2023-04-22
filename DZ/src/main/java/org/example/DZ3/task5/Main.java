package org.example.DZ3.task5;

import java.util.Arrays;

//при входном массиве, вернуть массив массивов со всеми перестановками его элементов.
//Пример входных данных:
//[1,2,3]
//Пример выходных данных:
//[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        System.out.println(returnArray(array));
    }

    static String returnArray(int[] array) {
        int count = factorial(array.length);
        System.out.println(count+" комбинаций: ");
        String[] arraysList = new String[count];

        int index = array.length-2;
        int temp = 0;
        for (int i = 0; i < count; i++) {
            String a = Arrays.toString(array);
            if (!arraysList.toString().contains(a)) {
                arraysList[i]= Arrays.toString(array);
                temp = array[index];
                array[index] = array[index+1];
                array[index+1] = temp;
                index = (index<1) ? array.length-2: index-1;
            } else {
                index = 0;
                temp = array[index];
                array[index] = array[index+1];
                array[index+1] = temp;
            }
        }
        Arrays.sort(arraysList);
        return Arrays.toString(arraysList);
    }
    static int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }
}
