package com.lab_4;

import java.util.Scanner;

// Программа удаляющая из целочисленного массива array размерности n элементы, равные целому числу x.

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int[] array = new int[0];

        // Ввод пользователем числа x

        System.out.println("Enter the 'x' value");
        while (!in.hasNext("quit")) {
            if (in.hasNextInt()) {
                x = in.nextInt();
                break;
            } else {
                System.out.println("Error type!");
                in.next();
            }
        }
        System.out.println("Еhe value 'x' has been saved successfully");
        System.out.println("Enter array elements or enter 'quit' to stop writing elements to the array");

        // Ввод новых элементов и их добавление в массив
        // с помощью временного массива

        while (!in.hasNext("quit")) {
            if (in.hasNextInt()) {
                int newElem = in.nextInt();
                int[] arrayTemp = new int[array.length];
                System.arraycopy(array, 0, arrayTemp, 0, array.length);
                array = new int[arrayTemp.length + 1];
                System.arraycopy(arrayTemp, 0, array, 0, arrayTemp.length);
                array[array.length - 1] = newElem;
            } else {
                System.out.println("Error type!");
                in.next();
            }
        }
        // Вывод на экран исходного массива
        System.out.println("The original state of the array");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();

        // Вывод на экран  массива без элементов, равных x
        System.out.println("The final state of the array");
        for (int elem : array) {
            if (elem != x)
                System.out.print(elem + " ");
        }
        System.out.println();
        in.close();
    }
}
