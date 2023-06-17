package day26;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/10:59
 * @Description:
 */
public class DifferentTest {
    public static void main(String[] args) {
        String s = "hello";

        String concat = s.concat(" ni").concat(" hao").concat(" a");

        System.out.println(concat);

        System.out.println("------------------------------------");

        StringBuffer hello = new StringBuffer("hello");

        hello.append(" ni").append(" hao").append(" a");
        System.out.println(hello);
    }
}
