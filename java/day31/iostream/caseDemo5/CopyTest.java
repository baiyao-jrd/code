package day31.iostream.caseDemo5;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/18:41
 * @Description:
 */
public class CopyTest {
    public static void main(String[] args) {
        File src = new File("java/day31/iostream/resources/other.txt");
        File des = new File("java/day31/iostream/resources/copy/1.txt");

        copy(src, des);
    }

    private static void copy(File src, File des) {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(src)));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(des)))
        ) {
            int len;
            char[] chars = new char[1024];

            while ((len = reader.read(chars)) != -1) {
                writer.write(chars, 0, len);
            }

            System.out.println("复制成功");
        } catch (FileNotFoundException e) {
            System.out.println("复制失败");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
