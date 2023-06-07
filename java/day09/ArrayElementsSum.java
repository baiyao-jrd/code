package day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/14/15:45
 * @Description: 对double数组中的所有元素值求和
 */
public class ArrayElementsSum {
    public static void main(String[] args) {
        double[] doubleArr = {1.0, 1.5, 2.5, 3};
        double sum = 0d;

        for (double elem : doubleArr) {
            sum += elem;
        }

        System.out.println("数组的所有元素和为：" + sum);
    }
}
