package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/0:48
 * @Description:
 */
public class Example5 {
    public static String interpret(String command) {
        return command.replace("(al)", "al").replace("()", "o");
    }

    public static String interpretTest(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpretTest("(al)G(al)()()G"));
    }
}
