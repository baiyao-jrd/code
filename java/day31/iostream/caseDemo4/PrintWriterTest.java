package day31.iostream.caseDemo4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/15:04
 * @Description:
 */
public class PrintWriterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = null;

        while (true) {
            System.out.print("输入: ");
            String s = scanner.nextLine();

            if ("stop".equals(s)) {
                break;
            }

            try {
                printWriter = new PrintWriter(new FileOutputStream("print.txt", true));

                if (s != null) {
                    printWriter.println(s);
                }

                System.out.println("请输入stop, 结束留言");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        try {
            scanner.close();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}