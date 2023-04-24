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
        int q = count/array.length;
        int start = (array.length>4) ? array.length-4 : 0;
        System.out.println(count+" комбинаций: ");
        String[] arraysList = new String[count];

        int index = array.length-1;
        int temp = 0;
        int i=0;
        do {
            String a = Arrays.toString(array);
            System.out.println(i+": "+a+", index = "+index);
            if (!Arrays.toString(arraysList).contains(a)) {
                arraysList[i]= Arrays.toString(array);
                index = (index<(2+start)) ? array.length-2: index-1;
                temp = array[index];
                array[index] = array[index+1];
                array[index+1] = temp;
                i++;
            } else {
                index = start;
                temp = array[index];
                array[index] = array[index+i/q];
                array[index+i/q] = temp;
                start = (start>0) ? (start-1)  : 0;
            }
        } while (i<count);
        Arrays.sort(arraysList);
        return Arrays.toString(arraysList);
    }
    static int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }
}
