package day31.iostream;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/15:30
 * @Description:
 */
public class SystemInTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        Scanner scan = null;

        fileInputStream = new FileInputStream("java/day31/iostream/resources/other.txt");

        System.setIn(fileInputStream);

        scan = new Scanner(System.in);

        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }

        try {
            fileInputStream.close();
        } finally {
            scan.close();
            System.setIn(new FileInputStream(FileDescriptor.in));
        }
    }
}
