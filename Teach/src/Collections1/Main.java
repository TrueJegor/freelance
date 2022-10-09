package Collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BoxFruits boxFruits = new BoxFruits();
    }

    public static void swap(Object[] arr, int n1, int n2){
        Object obj = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = obj;
    }

    public static void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static <T> ArrayList<T> convertToList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }
}
