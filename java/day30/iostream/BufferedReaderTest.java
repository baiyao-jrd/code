package day30.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/19:18
 * @Description:    按行从txt文件中读取信息
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            FileReader fileReader = new FileReader("message.txt");
            br = new BufferedReader(fileReader);

            String str;

            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
