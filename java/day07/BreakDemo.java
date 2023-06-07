package day07;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/12/16:05
 * @Description: break语句练习 -> 提前结束当前循环
 */
public class BreakDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("i = " + i);
            i++;

            if (i == 3) break;
        }
    }
}
