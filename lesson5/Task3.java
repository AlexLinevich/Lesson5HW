package com.itacademy.lesson5;

/**
 * Заданы 2 массива целых чисел произвольной длины. 
 * Написать программу, создающую третий массив,
 * представляющий собой слияние 2-х заданных.
 */
public class Task3 {

    public static void main(String[] args) {
        int[] values1 = {1, 3, 5, 7, 8, 9, 10};
        int[] values2 = {2, 4, 6, 11};
        System.out.println("Исходный массив 1 ");
        Task1.printArray(values1);
        System.out.println("Исходный массив 2 ");
        Task1.printArray(values2);
        System.out.println("Объединенный массив: ");
        Task1.printArray(joinArrays(values1, values2));
    }

    public static int[] joinArrays(int[] values1, int[] values2) {
        int joinedArrayLenghth = values1.length + values2.length;
        int[] joinedArray = new int[joinedArrayLenghth];
        if (values1.length <= values2.length) {
            int j = 0;
            int counter2 = values2.length;
            for (int i = 0; i < values1.length; i++) {
                joinedArray[j] = values1[i];
                joinedArray[j + 1] = values2[i];
                j += 2;
            }
            for (int i = joinedArrayLenghth - 1; i >= (values1.length * 2); i--) {
                joinedArray[i] = values2[counter2 - 1];
                counter2--;
            }
        } else {
            int j = 0;
            int counter1 = values1.length;
            for (int i = 0; i < values2.length; i++) {
                joinedArray[j] = values1[i];
                joinedArray[j + 1] = values2[i];
                j += 2;
            }
            for (int i = joinedArrayLenghth - 1; i >= (values2.length * 2); i--) {
                joinedArray[i] = values1[counter1 - 1];
                counter1--;
            }
        }
        return joinedArray;
    }
}


