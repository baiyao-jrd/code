package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/11:13
 * @Description:
 */
public class Example1 {
    public static int[] decode(int[] encoded, int first) {
        int[] intArr = new int[encoded.length + 1];

        intArr[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            intArr[i + 1] = encoded[i] ^ intArr[i];
        }

        return intArr;
    }

    public static void main(String[] args) {
        for (int i : decode(new int[]{1, 2, 3}, 1)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : decode(new int[]{6, 2, 7, 3}, 4)) {
            System.out.print(i + " ");
        }
    }
}
