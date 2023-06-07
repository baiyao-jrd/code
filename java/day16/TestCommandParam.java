package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/18:12
 * @Description: 命令行参数
 */
public class TestCommandParam {
    public static void main(String[] args) {
        System.out.println(args + "长度 -> " + args.length);

        for (String arg : args) {
            System.out.print(arg + " ");
        }
    }
}
