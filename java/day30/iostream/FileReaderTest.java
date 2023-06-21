package day30.iostream;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/19:06
 * @Description:
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("message.txt");

            char[] chars = new char[1024];

            int len;

            while ((len = fr.read(chars)) != -1) {
                System.out.print(new String(chars, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
