package day23.searchArrayCase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/23:12
 * @Description:
 */
public class ArrayTools {
    public static int searchTarget(int[] intArr, int tar) {
        try {
            for (int i = 0; i < intArr.length; i++) {
                if (intArr[i] == tar) {
                    return i;
                }
            }

            return -1;
        } catch (NullPointerException e) {
            e.printStackTrace();

            return -2;
        } finally {
            System.out.println("查找结束");
        }
    }
}
