package day30.iostream;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/14:22
 * @Description:
 */
public class TestFileFilter {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream");

        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });

        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
