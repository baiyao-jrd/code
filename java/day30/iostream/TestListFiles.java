package day30.iostream;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/14:14
 * @Description:
 */
public class TestListFiles {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30");

        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }
    }
}
