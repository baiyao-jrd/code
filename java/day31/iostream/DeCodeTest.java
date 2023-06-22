package day31.iostream;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/10:58
 * @Description:
 */
public class DeCodeTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = null;

        bf = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\yunnanbaiyao\\Desktop\\code\\java\\day31\\iostream\\resources\\test_gbk.txt"), "UTF-8"));

        String str;

        try {
            if ((str = bf.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bf != null) {
                bf.close();
            }
        }
    }
}
