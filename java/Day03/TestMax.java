package Day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/16:09
 * @Description: 使用条件运算符来求三个数中的最大值
 */
public class TestMax {
    public static void main(String[] args) {
        int a = 12;
        int b = 30;
        int c = -43;

        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;

        System.out.println("a,b,c中最大数为：" + max);
    }
}
