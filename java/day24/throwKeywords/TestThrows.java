package day24.throwKeywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/9:50
 * @Description:
 */
public class TestThrows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("请输入文件路径: ");
                String next = scanner.next();

                readFile(next);

                break;
            } catch (FileNotFoundException e) {
                e.printStackTrace();

                System.out.println("文件不存在, 请重新输入~~");
            }
        }

        System.out.println("程序结束~~");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        System.out.println(fileInputStream.toString());
    }
}
