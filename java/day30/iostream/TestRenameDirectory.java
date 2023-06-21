package day30.iostream;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/14:33
 * @Description:
 */
public class TestRenameDirectory {
    public static void main(String[] args) {
        File dir1 = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\test");
        File dir2 = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\test 代码");

        dir1.renameTo(dir2);
    }
}
