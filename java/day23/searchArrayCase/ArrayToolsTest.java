package day23.searchArrayCase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/23:21
 * @Description:
 */
public class ArrayToolsTest {
    public static void main(String[] args) {
        System.out.println(ArrayTools.searchTarget(new int[]{1, 3, 6, 8, -3}, -3));
        System.out.println(ArrayTools.searchTarget(new int[]{1, 3, 6, 8, -3}, 33));
        System.out.println(ArrayTools.searchTarget(null, 9));
    }
}
