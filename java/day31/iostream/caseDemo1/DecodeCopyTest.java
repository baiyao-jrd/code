package day31.iostream.caseDemo1;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/11:44
 * @Description:
 */
public class DecodeCopyTest {
    public static void main(String[] args) throws IOException {
        copy(new File("java/day31/iostream/resources/test.txt"), "GBK",
                new File("java/day31/iostream/resources/copy.txt"), "UTF-8");
    }

    private static void copy(File src, String decode, File des, String code) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(src), decode));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(des), code));

        String str;

        if ((str = bf.readLine()) != null) {
            bw.write(str);
            bw.newLine();
        }

        try {
            if (bf != null) {
                bf.close();
            }
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }
}
