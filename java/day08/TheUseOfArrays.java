package day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/13/17:32
 * @Description: 数组的使用 -> 获取数组的长度、获取某个位置的元素值、更新某个位置的元素值
 */
public class TheUseOfArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("数组长度为：" + arr.length);

        System.out.println("数组中第二个位置的元素值为：" + arr[1]);

        arr[1] = 6;

        System.out.print("将第二个元素的值更新为6，查看下：");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
