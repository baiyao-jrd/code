package day30.iostream.caseDemo5;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/22:20
 * @Description:
 */
public class CopyTest1 {
    public static void main(String[] args) {
        try {
            copy(new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\1.webp"), new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\2.webp"));

            System.out.println("复制成功");
        } catch (IOException e) {
            System.out.println("复制失败");
            e.printStackTrace();
        }
    }

    public static void copy(File a, File b) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(a);
        FileOutputStream fileOutputStream = new FileOutputStream(b);

        byte[] bytes = new byte[1024 * 1024];

        int len;

        try {
            if ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } finally {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            }
        }
    }
}
