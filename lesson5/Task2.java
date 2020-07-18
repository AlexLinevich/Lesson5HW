package com.itacademy.lesson5;

/**
 * Написать программу, удаляющую все повторяющиеся целые
 * числа из массива и печатающую результат. Массив должен
 * использоваться тот же самый. На место удаленных элементов
 * ставить цифру 0.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] values = {2, 4, 6, 7, 4, 7, 8, 2, 5, 3, 5};
        System.out.println("Исходный массив:");
        Task1.printArray(values);
        System.out.println("Новый массив:");
        int[] values1 = deleteSameNumbers(values);
        Task1.printArray(values1);
    }

    public static int[] deleteSameNumbers(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i+1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    values[j] = 0;
                }
            }
        }
        return values;
    }
}
