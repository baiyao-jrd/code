package day30.iostream.caseDemo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/15:22
 * @Description:
 */
public class TestListAllSubs2 {
    public static void main(String[] args) {
//        File dir = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30");
        File dir = new File("ni0");
        ArrayList<File> files = new ArrayList<>();

        try {
            listSubDirs(dir, files);

            for (File file : files) {
                System.out.println(file.getName());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void listSubDirs(File dir, ArrayList<File> filesList) throws FileNotFoundException {
        if (dir == null || !dir.exists()) {
            throw new FileNotFoundException("路径不存在");
        }

        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("非目录");
        }

        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return dir.isDirectory();
            }
        });

        if (files != null) {
            for (File dirs : files) {
                if (dirs != null && dirs.isDirectory()) {
                    filesList.add(dirs);
                    listSubDirs(dirs, filesList);
                }
            }
        }
    }
}
