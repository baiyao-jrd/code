package day01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/06/17:56
 * @Description:
 */
public class TestLogicalOperation {
    public static void main(String[] args) {
        int i = 100;
        int j = 9;

        System.out.println(++i + i);    //101 + 101 = 202
        System.out.println(i++ + i);    //101 + 102 = 203
        System.out.println(i++ > 100 & j-- < 9);    //9 < 9 => false
        System.out.println(i + "\t" + j);   //103   8
        System.out.println(i++ > 100 || j-- < 9);   //103 > 100

        /**
         * 注意这里的j
         */
        System.out.println(i + "\t" + j);   //104   这里的j为什么还是8呢？因为上面的j--未执行，i++ > 100直接返回了true
    }
}
