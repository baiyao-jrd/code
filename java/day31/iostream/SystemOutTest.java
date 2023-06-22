package day31.iostream;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/15:54
 * @Description:
 */
public class SystemOutTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("哈哈哈哈哈");

        System.setOut(new PrintStream("out.txt"));

        System.out.println("你是谁？");
        System.out.println(1);
        System.out.println(1.5);
        System.out.println('a');
        System.out.println(true);

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        System.out.println("嘻嘻嘻嘻嘻嘻");
    }
}
