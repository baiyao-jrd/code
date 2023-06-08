package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/13:58
 * @Description:
 */
public class Example3 {
    public static int xorOperation(int n, int start) {
        int flag = 0;
        for (int i = 0; i < n; i++) {
            flag ^= start + 2 * i;
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));
        System.out.println(xorOperation(4, 3));
        System.out.println(xorOperation(1,7));
        System.out.println(xorOperation(10, 5));
    }
}
