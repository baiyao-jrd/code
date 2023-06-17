package day26.mathClass;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/21:38
 * @Description:        请随机产生10个[0, 100)的整数值, 按照从小到大排序输出
 */
public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        int[] ints = new int[10];

        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(100);
        }

        ergodic(ints);

        Arrays.sort(ints);

        ergodic(ints);
    }

    public static void ergodic(int[] arr) {

        System.out.print("数组: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
