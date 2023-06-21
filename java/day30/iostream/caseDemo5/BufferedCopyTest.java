package day30.iostream.caseDemo5;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/22:42
 * @Description:
 */
public class BufferedCopyTest {
    public static void main(String[] args) {
        try {
            bufferedCopy(new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\2.webp"),
                    new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\3.webp"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bufferedCopy(File a, File b) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(a));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(b));

        byte[] bytes = new byte[(int) a.length()];

        int len;

        if ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }

        try {
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
        } finally {
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
        }
    }
}
