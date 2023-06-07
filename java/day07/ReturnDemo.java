package day07;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/12/16:30
 * @Description: return语句练习 -> 结束方法
 */
public class ReturnDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print(i);
                if (i == j) return;
            }
            System.out.println();
        }
    }
}
