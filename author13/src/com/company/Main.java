package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Одномерные массивы");
        System.out.println();
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начало отрезка");
        int c = in.nextInt();
        System.out.println("Введите конец отрезка");
        int d = in.nextInt();
        System.out.println("Элементы массива из отрезка [" + c + "," + d + "]");
        sectionArray(array, c-1,d);
        System.out.println();
        System.out.println("Двумерные массивы");
        System.out.println();
        int[][] matrix = new int[5][5];
        fillingMatrix(matrix);
        printMatrix(matrix);
        System.out.println("Введите число ");
        int value = in.nextInt();
        sumMatrixElem(matrix, value);
    }

    /**
     * Задание по одномерным массивам
     * @param array исходный массив
     * @param c левая граница отрезка
     * @param d правая граница отрезка
     */
    static void sectionArray(int[] array, int c, int d){
        if(c < d){
            for (int i = c; i < d; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * решение задачи
     * @param array исходный массив
     * @param value введенное число
     */
    static void sumMatrixElem(int[][] array, int value){
        int[] sum = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum[i] += array[i][j];

            }
            System.out.print(sum[i] + " ");
        }

        for (int i = 0; i < sum.length; i++) {
            if(sum[i] < value){
                System.out.println("\nСумма элементов в строке " + i + " меньше ввведенного значения: " + value);
            }
        }
    }

    /**
     * Заполнение матрицы случайными числами
     * @param array
     */
    static void fillingMatrix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int)(Math.random()*10);
            }
        }
    }

    /**
     * вывод матрицы в консоль
     * @param array
     */
    static void printMatrix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
