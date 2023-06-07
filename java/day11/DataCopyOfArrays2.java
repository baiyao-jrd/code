package day11;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/17/16:36
 * @Description: 数组的反转 -> 首尾交换法 -> 这个不产生新的数组
 */
public class DataCopyOfArrays2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, -3, 6};

        System.out.print("反转前arr: ");
        traverseOfArrays(arr);

        for (int i = 0; i <= (arr.length - 1) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.print("\n反转后arr: ");
        traverseOfArrays(arr);
    }

    private static void traverseOfArrays(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
