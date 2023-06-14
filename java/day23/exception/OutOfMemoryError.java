package day23.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/22:22
 * @Description:
 */
public class OutOfMemoryError {
    public static void main(String[] args) {
        int[] ints = new int[5];

        while (true) {
            // Invalid initial heap size: -Xms
            int[] intArray = new int[ints.length << 600000000000000000l];
        }
    }
}
