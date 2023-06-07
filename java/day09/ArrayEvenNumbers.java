package day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/14/15:49
 * @Description: 统计int数组中偶数元素值的个数
 */
public class ArrayEvenNumbers {
    public static void main(String[] args) {
        int[] intArr = {1, 3, 5, 6, 8, 10, 12};

        int evenCount = 0;

        for (int elem : intArr) {
            if (elem % 2 == 0)  evenCount++;
        }

        System.out.println("整型数组中有" + evenCount + "个偶数~");
    }
}
