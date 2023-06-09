package day19.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/9:59
 * @Description:
 */
public class Example3 {
    public static int game(int[] guess, int[] answer) {
        int flag = 0;

        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i])
                flag++;
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(game(new int[]{1, 2, 3}, new int[]{1, 2, 3}));

        System.out.println();

        System.out.println(game(new int[]{2,2,3}, new int[]{3,2,1}));
    }
}
