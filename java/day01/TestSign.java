package day01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/06/17:33
 * @Description:
 */
public class TestSign {
    public static void main(String[] args) {
        /*
            i++（先赋值后运算）与++i（先运算后赋值）
         */

        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.println("i: " + i);  //i: 10     i1: 11
        i = ++i1;
        System.out.println("i: " + i);  //i: 12     i1: 12
        System.out.println("i1: " + i1);
        i = i2--;
        System.out.println("i: " + i);  //i: 20     i2: 19
        System.out.println("i2: " + i2);
        i = --i2;
        System.out.println("i: " + i);  //i: 18     i2: 18
        System.out.println("i2: " + i2);
    }
}
