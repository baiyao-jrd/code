package day29.generics.caseDemo3;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/15:53
 * @Description:
 */
public class MyArrays {
    public static <T> ArrayList<T> asList(T...a) {
        ArrayList<T> arr = new ArrayList<>();
        for (T t : a) {
            arr.add(t);
        }

        return arr;
    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static <T> void reverse(T[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            swap(arr, i, j);
        }
    }
}
