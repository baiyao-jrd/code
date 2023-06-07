package day05;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/10/17:23
 * @Description: 练习for的嵌套循环
 */
public class NestingForLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 3; j++) {
                System.out.println(i + " -> " + j);
            }
        }
    }
}
