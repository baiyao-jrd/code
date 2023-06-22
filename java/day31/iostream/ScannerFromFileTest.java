package day31.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/16:13
 * @Description:
 */
public class ScannerFromFileTest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("java/day31/iostream/resources/other.txt"));

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
