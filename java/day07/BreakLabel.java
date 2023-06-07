package day07;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/12/16:16
 * @Description: 使用break直接结束外层for循环 -> 给for循环加标签
 */
public class BreakLabel {
    public static void main(String[] args) {
        outerLoop: for (int i = 1; i < 5; i++) {
            innerLoop: for (int j = 1; j < 5; j++) {
                System.out.print(i);
                if (i == 3) break outerLoop;
            }
            System.out.println();
        }
    }
}
