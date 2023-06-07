package day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/09/16:48
 * @Description: 练习switch-case -> 注意没有break的情况下，case语句会向下贯穿执行
 *                                 default是备选项
 */
public class TestDefault {
    public static void main(String[] args) {
        int x = 100;
//        int a = 2;
        int a = 4;

        switch( a ) {
            case 1:
                x += 5;
            default:
                x += 34;
            case 2:
                x += 10;
            case 3:
                x += 16;

        }

        System.out.println("x = " + x);
        /**
         * a = 2 -> 100 + 10 + 16 = 126
         * a = 4 -> 100 + 34 + 10 + 16 = 160
         */
    }
}
