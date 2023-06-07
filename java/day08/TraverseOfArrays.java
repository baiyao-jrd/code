package day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/13/17:56
 * @Description: 一维数组的遍历方式
 */
public class TraverseOfArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        //1. 方式一
        System.out.println("数组的第一个元素是：" + arr[0]);
        System.out.println("数组的第二个元素是：" + arr[1]);
        System.out.println("数组的第三个元素是：" + arr[2]);

        System.out.println();
        //2. 方式二 -> 循环遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println("数组的第" + (i + 1) + "个元素是：" + arr[i]);
        }
    }
}
