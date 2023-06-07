package day05;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/10/17:03
 * @Description: for的多变量初始化以及多变量更新
 */
public class ForMultipleInitial {
    public static void main(String[] args) {
        for (int i = 1, j = 10; i < 5; i++, j-- ) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
