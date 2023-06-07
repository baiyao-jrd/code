package day07;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/12/16:10
 * @Description: 嵌套循环break练习
 */
public class NestLoopBreakDemo {
    public static void main(String[] args) {
        for ( int i = 1; i < 5; i++ ) {
            for ( int j = 1; j < 5; j++ ) {
                System.out.print(i);
                if (i == j) break;
            }
            System.out.println();
        }
    }
}
