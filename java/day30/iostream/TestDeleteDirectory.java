package day30.iostream;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/14:30
 * @Description:
 */
public class TestDeleteDirectory {
    public static void main(String[] args) {
        File dir1 = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\delete");
        dir1.mkdir();

        dir1.delete();
    }
}
