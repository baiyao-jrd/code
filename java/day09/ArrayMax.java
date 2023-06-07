package day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/14/15:54
 * @Description: 找出数组中的最大值
 */
public class ArrayMax {
    public static void main(String[] args) {
        int[] intArr = {1, 2, -3, 56};

        int arrayMax = Integer.MIN_VALUE;

        for (int elem : intArr) {
            if (elem > arrayMax)  arrayMax = elem;
        }

        System.out.println("数组中的最大值是：" + arrayMax);
    }
}
