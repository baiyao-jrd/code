package day30.iostream;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/13:51
 * @Description:
 */
public class TestCreateTempFile {
    public static void main(String[] args) throws IOException {
        File world = File.createTempFile("World", ".tmp");

        System.out.println(world.getAbsolutePath());
    }
}
