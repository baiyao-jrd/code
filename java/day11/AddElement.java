package day11;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/17/16:49
 * @Description: 数组中存有一部分图书，现在要增加新图书，图数量不清楚，需要数组支持动态扩容
 */
public class AddElement {
    public static void main(String[] args) {
        String[] strArr = {"三国", "红楼", "西游"};
        Boolean flag = true;
        int currentBooksNums = strArr.length;

        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.print("\n添加新书：");
            String newBook = scanner.next();

            if (currentBooksNums > strArr.length - 1) {
                String[] expandArray = new String[strArr.length + (strArr.length >> 1)];

                for (int i = 0; i < strArr.length; i++) {
                    expandArray[i] = strArr[i];
                }
                strArr = expandArray;
            }

            strArr[currentBooksNums] = newBook;
            currentBooksNums++;

            bookList(strArr);

            System.out.print("\n是否还要录入新的图书[Y/N]：");
            char answer = scanner.next().charAt(0);
            if (answer == 'N')  flag = false;
        }
    }

    private static void bookList(String[] strArr) {
        System.out.print("\n当前的图书有：");
        for (String elem : strArr) {
            System.out.print(elem != null ? elem + " " : "");
        }
    }
}