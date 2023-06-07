package day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/09/17:41
 * @Description: do while 语句练习
 */
public class TestDoWhile {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("第" + i + "次循环~");
            i++;
        } while ( i < 5 );
    }
}
