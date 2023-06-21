package day30.iostream.caseDemo3;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/16:26
 * @Description:
 */
public class TestDeleteNotEmptyDir {
    public static void main(String[] args) {
        File dirs = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30\\iostream\\resources");

        try {
            deleteNotEmpty(dirs);
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    public static void deleteNotEmpty(File dir) throws FileNotFoundException {
        if (!dir.exists() || dir == null) {
            throw new FileNotFoundException("目录/文件不存在");
        }

        if (dir.isFile()) {
            dir.delete();
        } else if (dir.isDirectory()) {
            File[] files = dir.listFiles();

            if (files == null) {
                dir.delete();
            } else  {
                for (File file : files) {
                    deleteNotEmpty(file);
                }
                dir.delete();
            }
        }
    }
}
