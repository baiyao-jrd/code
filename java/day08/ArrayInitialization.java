package day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/13/17:23
 * @Description: 一维数组的初始化练习
 */
public class ArrayInitialization {
    public static void main(String[] args) {
        //1. 一维数组的静态初始化
        //1.1 方式一
        int[] arr = new int[] {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        //1.2 方式二
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        //2. 一维数组的动态初始化
        int[] dynamicInitial = new int[5];

        for (int i = 1; i <= dynamicInitial.length; i++) {
            dynamicInitial[i - 1] = i;
            System.out.print(dynamicInitial[i - 1] + " ");
        }
    }
}
