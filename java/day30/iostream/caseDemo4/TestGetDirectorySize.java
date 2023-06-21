package day30.iostream.caseDemo4;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/17:01
 * @Description:
 */
public class TestGetDirectorySize {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30");

        try {
            System.out.println(size(dir));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    public static long size(File dir) throws FileNotFoundException {
        long size = 0;

        if (!dir.exists() || dir == null) {
            throw new FileNotFoundException("路径不存在");
        }

        if (dir.isFile()) {
            size += dir.length();
        } else if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        size += file.length();
                    } else {
                        size += size(file);
                    }
                }
            }
        }

        return size;
    }
}
