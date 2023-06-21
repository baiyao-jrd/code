package day30.iostream;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/14:08
 * @Description:
 */
public class TestCreateDirectory {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\dir");

        dir.mkdir();

        File dirs = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\dir\\dir1\\dir2\\dir3");

        dirs.mkdirs();
    }
}
