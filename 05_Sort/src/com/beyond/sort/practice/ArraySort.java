package com.beyond.sort.practice;

public class ArraySort {
    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j;

            for (j = i - 1; j >= 0 && numbers[j] > key; j--) {
                numbers[j+1] = numbers[j];

            }

            numbers[j+1] = key;
        }
    }

    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];

                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }


}
