package day20.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/15:47
 * @Description:
 */
public class Example6 {
    public static int houseCount(Street street, int k) {
        int flag = 0;

        for (int i = 0; i < k; i++) {
            if (street.isDoorOpen()) {
                flag++;
            } else {
                flag++;
            }
        }

        return flag;
    }

    public static void main(String[] args) {

    }
}
