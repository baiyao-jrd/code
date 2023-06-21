package day30.iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/18:54
 * @Description:
 */
public class FileWriterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FileWriter fw = null;

        try {
            fw = new FileWriter("message.txt", true);

            while (true) {
                System.out.print("请输入留言(stop结束): ");

                String s = scanner.nextLine();

                if (s.equals("stop")) {
                    break;
                }

                fw.write(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
