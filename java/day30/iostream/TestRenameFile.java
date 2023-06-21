package day30.iostream;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/14:02
 * @Description:
 */
public class TestRenameFile {
    public static void main(String[] args) {
        File a = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\Hello.java");
        File b = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\World.java");

        a.renameTo(b);
    }
}
