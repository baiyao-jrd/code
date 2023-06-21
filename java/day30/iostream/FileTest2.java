package day30.iostream;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/13:41
 * @Description:
 */
public class FileTest2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources\\baiYao.java");
        long l = file.lastModified();

        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(l);

        System.out.println("文件的最后修改时间: " + format);
        System.out.println("文件大小: " + file.length());
    }
}
