package com.itacademy.lesson5;

import java.util.Arrays;

/**
 * Написать функцию linearize, которая принимает в качестве
 * параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами
 * двумерного.
 */
public class Task4 {

    public static void main(String[] args) {
        int[][] values = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9}
        };
        System.out.println("Исходный массив:");
        for (int[] columns: values) {
            System.out.println(Arrays.toString(columns));
        }
        System.out.println("Новый одномерный массив: ");
        System.out.println(Arrays.toString(linearize(values)));
    }

    public static int[] linearize(int[][] values){
        int newArrayLength = values[0].length + values[1].length;
        int[] newArray = new int[newArrayLength];
        for (int i = 0; i < values[0].length; i++) {
            newArray[i] = values[0][i];
        }
        for (int i = 0; i < values[1].length; i++) {
            newArray[i + values[0].length] = values[1][i];
        }
        return newArray;
    }
}
