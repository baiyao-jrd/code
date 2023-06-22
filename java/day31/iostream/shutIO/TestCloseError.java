package day31.iostream.shutIO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/18:02
 * @Description:
 */
public class TestCloseError {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("java/day31/iostream/resources/other.txt");
            System.out.println(fileInputStream.read());
        } finally {
            fileInputStream.close();
        }
    }
}
