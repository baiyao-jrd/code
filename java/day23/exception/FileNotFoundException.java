package day23.exception;

import java.io.FileInputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/21:53
 * @Description:
 */
public class FileNotFoundException {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        // Exception in thread "main" java.io.FileNotFoundException: d:\baiyao.jpg (系统找不到指定的文件。)
        FileInputStream fileInputStream = new FileInputStream("d:/baiyao.jpg");
    }
}
