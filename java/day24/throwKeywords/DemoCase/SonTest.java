package day24.throwKeywords.DemoCase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/11:28
 * @Description:
 */
public class SonTest {
    public static void main(String[] args) {
        Son son = new Son();
        try {
            son.method();
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        } finally {
            System.out.println("who are you?");
        }
    }
}
