package day27.treeSet.caseDemo;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/16:45
 * @Description:
 */
public class Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Character> characters = new LinkedHashSet();

        System.out.print("请输入连续的字母字符: ");
        String str = scanner.next();

        for (char c : str.toCharArray()) {
            characters.add(c);
        }

        for (Character character : characters) {
            System.out.print(character + " ");
        }
    }
}
