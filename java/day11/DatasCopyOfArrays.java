package day11;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/17/16:16
 * @Description: 数组元素的复制
 */
public class DatasCopyOfArrays {
    public static void main(String[] args) {
        int[] arr = {1, 4, -6, 8};

        int[] arrCopy = new int[arr.length];

        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i] = arr[i];
        }

        System.out.print("\narr: ");
        traverseOfArrays(arr);

        System.out.print("\narrCopy: ");
        traverseOfArrays(arrCopy);

        arrCopy[0] = -9527;

        System.out.print("\narr: ");
        traverseOfArrays(arr);

        System.out.print("\narrCopy: ");
        traverseOfArrays(arrCopy);
    }

    private static void traverseOfArrays(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}