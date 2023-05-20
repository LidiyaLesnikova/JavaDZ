package org.example.DZ2.task3;

import java.util.Arrays;

// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива

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
            else if (arr[i]<0) {
                list = list.replace(String.valueOf(arr[i]),"XX");
            }
        }
        list = list.replaceAll("XX",String.valueOf(sum));
        return list;
    }
}