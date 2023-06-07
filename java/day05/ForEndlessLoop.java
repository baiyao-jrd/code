package day05;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/10/16:59
 * @Description: for的死循环
 */
public class ForEndlessLoop {
    public static void main(String[] args) {
        int i = 0;
        for (;;) {
            System.out.println("i = " + i);
            i++;
        }
    }
}
