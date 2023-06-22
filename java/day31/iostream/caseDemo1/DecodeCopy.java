package day31.iostream.caseDemo1;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/11:14
 * @Description:
 */
public class DecodeCopy {
    public static void main(String[] args) throws IOException {
        decodeCopy(new File("java/day31/iostream/resources/test.txt"), new File("java/day31/iostream/resources/other.txt"));
    }

    public static void decodeCopy(File src, File des) throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(src), "GBK"));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(des), "UTF-8"));

        int len;
        char[] chars = new char[(int) src.length()];

        if ((len = bufferedReader.read(chars)) != -1) {
            bufferedWriter.write(chars, 0, len);
        }

        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } finally {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }
    }
}
