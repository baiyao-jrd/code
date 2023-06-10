package day20.finalKeyword;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/17:10
 * @Description:
 */
public class Example2 {
    public static void main(String[] args) {

    }

    static final int A = 1;

    static final int B;

    static  {
        B = 2;
    }

    final int C = 3;

    final int D;

    {
        D = 4;
    }

    final int F;

    public Example2() {
        F = 5;
    }

    public Example2(int f) {
        F = f;
    }
}
