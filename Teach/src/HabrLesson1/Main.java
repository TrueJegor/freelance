package HabrLesson1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int jopa;
        System.out.println("LESSON ONE");
        less1();
        System.out.println("LESSON TWO");
        less2();
        System.out.println("LESSON THREE");
        less3();
        System.out.println("LESSON FOUR");
        less4();
    }


    public static void less4(){
        int[] array = new int[15];

        int a = 3;
        for(int i = 0; i < array.length; i++){
            array[i] = rnd(1, 5);
        }

        printArray(array);

        int vl = 0;
        int temp = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == a) {
                    array[i] = array[i + 1];
                    for(int j = 0; j < array.length; j++){
                        temp = array[i+1];
                        array[i+1] = array[i+2];
                        array[i+2] = temp;
                    }
                    vl++;
                }
            }

        int[] array2 = new int[array.length-vl];

        for(int i = 0; i < array2.length; i++){

        }

        printArray(array);
    }

    public static void less3(){
        for(int i = 2; i <= 100; i++){
            for(int j = 2; j <= 100; j++){
                if(i%j == 0){
                    continue    ;
                }
            }
           // System.out.println(i);
        }
    }

    public static void less2(){
        int[] array = new int[20];
        int lenght = array.length;
        for(int i = 0; i < lenght; i++){
            array[i] = rnd(0,20);
        }

        printArray(array);

        var temp = 0;

        int i = 0;
        int j = 0;
        int value = 0;

        for(j = 0; j < array.length; j++) {

            for ( i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    value ++;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted array");
        System.out.println("Value = " + value);
        System.out.println("Value j = " + j);
        printArray(array);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int rnd(int min, int max){
        Random random = new Random();
        return random.ints(min, max).findFirst().getAsInt();
    }

    public static void less1(){
        double[] array = new double[10];

        for(int i = 0; i < array.length; i++){
            array[i] = Math.random();
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        double max = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("\nIts maximum: " + max);

        double value = 0;

        for(int i = 0; i < array.length; i++){
            value += array[i];
        }

        System.out.println("Avarage value of array: " + value/array.length);
    }
}
