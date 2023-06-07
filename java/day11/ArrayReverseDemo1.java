package day11;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/17/16:27
 * @Description: 数组元素的反转 -> 反转赋值给新数组，之后将新数组的地址赋值给旧数组
 */
public class ArrayReverseDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("反转前的arr：");
        traverseOfArrays(arr);

        int[] reverseArray = new  int[arr.length];

        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = arr[reverseArray.length - 1 - i];
        }

        //指向新数组
        arr = reverseArray;

        System.out.print("\n反转后的arr: ");
        traverseOfArrays(arr);
    }

    private static void traverseOfArrays(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}