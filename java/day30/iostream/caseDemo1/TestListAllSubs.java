package day30.iostream.caseDemo1;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/14:41
 * @Description:    列出某个目录所有的子级目录
 */
public class TestListAllSubs {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day30");
        iteator(dir);
    }

    public static void iteator(File dir) {
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getName());
                    iteator(new File(dir.getAbsoluteFile() + "\\" + file.getName()).getAbsoluteFile());
                }
            }
        }
    }
}
