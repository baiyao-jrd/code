package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/18:27
 * @Description:
 */
public class ArrayParam {
    public static int sum(int[] intArr) {
        int result = 0;

        for (int value : intArr) {
            result += value;
        }

        return result;
    }

    public static int sumNew(int...values) {
        int result = 0;

        for (int value : values) {
            result += value;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 3, -2}));
        System.out.println(sum(new int[]{}));

        System.out.println(sumNew(1, 3, -2));
        System.out.println(sumNew(new int[]{1, 2,-1 }));
    }
}
