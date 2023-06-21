package day30.iostream.caseDemo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/16:03
 * @Description:
 */
public class TestListAllJavaFiles {
    public static void main(String[] args) {
        File dirs = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30");

        try {
            for (File listJavaFile : listJavaFiles(dirs)) {
                System.out.println(listJavaFile.getName());
            }
        } catch (FileNotFoundException | IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<File> listJavaFiles(File dirs) throws FileNotFoundException {
        if (dirs == null || !dirs.exists()) {
            throw new FileNotFoundException("路径不存在");
        }

        if (!dirs.isDirectory()) {
            throw new IllegalArgumentException("非目录");
        }

        ArrayList<File> files = new ArrayList<>();

        File[] listfiles = dirs.listFiles();

        if (listfiles != null) {
            for (File listfile : listfiles) {
                if (listfile.isFile()) {
                    files.add(listfile);
                } else {
                    files.addAll(listJavaFiles(listfile));
                }
            }
        }

        return files;
    }
}
