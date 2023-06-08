package day18.polymorphic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/22:25
 * @Description:
 */
public class FatherSonTest {
    public static void main(String[] args) {
        Father son = new Son();

        System.out.println(son.father);
        son.method();
    }
}
