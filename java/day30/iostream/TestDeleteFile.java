package day30.iostream;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/13:58
 * @Description:
 */
public class TestDeleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\World.java");
        file.createNewFile();

        file.delete();
    }
}
