package threading;

import java.sql.SQLOutput;

public class MainApp extends Thread{
    static final int SIZE = 10;
    static final int HALF = SIZE/2;

    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[SIZE];

        int[] array1 = new int[HALF];
        int[] array2 = new int[HALF];

        long a = System.currentTimeMillis();
        arrayToOne(array);
        print(array);
        f(array);
        print(array);
        System.out.println("One thread 1:");
        System.out.println(System.currentTimeMillis() - a);

        long globalTime = System.currentTimeMillis();
        //threads
        Thread t = new Thread(() -> {
            long time2 = System.currentTimeMillis();
            System.arraycopy(array, 0, array1, 0, HALF);
            arrayToOne(array1);
            int value = 0;
            for (int i = 0; i < array.length; i++) {
                if(array[i] == 1){
                    value++;
                }
            }
            System.out.println(value);
            f(array1);
            System.out.println("MultiThread 1 :");
            System.out.println(System.currentTimeMillis() - time2);
        });

        Thread t2 = new Thread(() -> {
            long time2 = System.currentTimeMillis();
            System.arraycopy(array, HALF, array2, 0, HALF);
            arrayToOne(array2);
            f(array2);
            System.out.println("MultiThread 2 :");
            System.out.println(System.currentTimeMillis() - time2);
        });
        t.start();
        t2.start();
        t.join();
        t2.join();

        System.arraycopy(array, 0, array, 0, HALF);
        System.arraycopy(array2, 0, array, HALF, HALF);
        System.out.println("Global time after all operations: ");
        System.out.println(System.currentTimeMillis() - globalTime);
        int temp = 0;
        arrayToOne(array);
    }

    public static void arrayToOne(int[] array){
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            value++;
        }
        System.out.println("Value");
        System.out.println(value);
    }

    public static int[] f(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (array[i] * Math.sin(0.2 + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4 * i/2));
        }
        return array;
    }

    public static void print(int[] array){
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+1230000 + " ");
        }
        System.out.println();
    }
}
