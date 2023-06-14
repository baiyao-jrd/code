package day23.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/21:50
 * @Description:
 */
public class TestArrayOutOfBoundsException {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4};

        // 数组下标越界异常 -> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        System.out.println(intArr[4]);
    }
}
