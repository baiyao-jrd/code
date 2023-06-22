package day31.iostream.caseDemo5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/18:08
 * @Description:
 */
public class TestCloseOrder {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bf = null;

        try {
            fw = new FileWriter("baiYao.txt");

            bf = new BufferedWriter(fw);

            bf.write("baiyao 白药 江润冬");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fw != null) {
                        fw.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
