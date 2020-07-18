package com.itacademy.lesson5;

/**
 * Напишите программу, которая циклически сдвигает элементы
 * массива вправо на одну позицию (несколько позиций), и печатает результат.
 * Цикличность означает, что последний элемент массива становится
 * самым первым его элементом.
 */
public class Task1 {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        int[] newShiftedArray = values;
        int shift = 2;
        System.out.println("Исходный массив: ");
        printArray(values);
        for (int i = 0; i < shift; i++) {
            newShiftedArray = shiftArray(newShiftedArray);
        }
        System.out.println("Массив сдвинутый на " + shift);
        printArray(newShiftedArray);
    }

    public static int[] shiftArray(int[] values) {
        int[] shiftedArray = new int[values.length];
        shiftedArray[0] = values[values.length - 1];
        for (int j = 0; j < values.length - 1; j++) {
            shiftedArray[j + 1] = values[j];
        }
        return shiftedArray;
    }

    public static void printArray(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
