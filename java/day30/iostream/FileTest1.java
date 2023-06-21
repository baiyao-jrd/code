package day30.iostream;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/13:31
 * @Description:
 */
public class FileTest1 {
    public static void main(String[] args) throws IOException {
        File file = new File("../../HelloIO.java");
        System.out.println("userDir: " + System.getProperty("user.dir"));

        System.out.println("文件目录名: " + file.getName());
        System.out.println("文件路径名: " + file.getPath());
        System.out.println("文件绝对路径名: " + file.getAbsolutePath());
        System.out.println("文件规范路径名: " + file.getCanonicalPath());
        System.out.println("文件父目录名: " + file.getParent());
        System.out.println("文件父目录对象: " + file.getParentFile());
    }
}
