package day11;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/17/16:08
 * @Description: 数组的复制 -> 这里只是演示数组地址的赋值 -> 更改其中一个数组的元素值，另一个数组的元素值也会被更改
 */
public class CopyOfArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, -3};
        int[] arrCopy = arr;

        System.out.print("arr: ");

        for (int elem : arr) {
            System.out.print(elem + " ");
        }

        System.out.print("\narrCopy: ");

        for (int elem : arrCopy) {
            System.out.print(elem + " ");
        }

        //更改一下0位置的元素值
        arrCopy[0] = 9527;

        System.out.print("\narr: ");

        for (int elem : arr) {
            System.out.print(elem + " ");
        }

        System.out.print("\narrCopy: ");

        for (int elem : arrCopy) {
            System.out.print(elem + " ");
        }
    }
}

/**
 * arr: 1 2 5 -3
 * arrCopy: 1 2 5 -3
 * arr: 9527 2 5 -3
 * arrCopy: 9527 2 5 -3
 */