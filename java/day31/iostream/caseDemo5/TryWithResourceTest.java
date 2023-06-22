package day31.iostream.caseDemo5;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/18:33
 * @Description:
 */
public class TryWithResourceTest {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("java/day31/iostream/resources/other.txt")));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("java/day31/iostream/resources/copy/copyofother.txt")))
        ) {
            String str;
            if ((str = reader.readLine()) != null) {
                writer.write(str);
            }
            System.out.println("文件复制成功");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件复制失败");
        }
    }
}
