package day07;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/12/16:22
 * @Description: continue语句练习 -> continue表示继续下次循环，continue后面的语句不再执行
 *
 * continue: 中断本次循环
 * break: 中断本层循环
 */
public class ContinueDemo {
    public static void main(String[] args) {
        int i = 1;

        while (i < 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
