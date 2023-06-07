package day12;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/16:05
 * @Description: 数组元素的删除
 */
public class RemoveElements {
    public static void main(String[] args) {
        String[] strArr = {"三国", "红楼", "水浒", "金瓶梅"};
        Scanner scanner = new Scanner(System.in);

        Boolean flag = true;
        int bookNums = strArr.length;

        while(flag) {
            System.out.print("\n请输入要删除的图书：");
            String deleteBook = scanner.next();

            int findIndex = -1;

            for (int index = 0; index < strArr.length; index++) {
                if (deleteBook.equals(strArr[index])) {
                    findIndex = index;
                    break;
                }
            }

            System.out.println("findIndex: " + findIndex);

            if (findIndex != -1) {
                //1. 如果是最后一个元素，就直接赋值null，不需要移动其它元素，同时图书数量自减一
                if (bookNums -1 == findIndex) {
                    strArr[findIndex] = null;
                    bookNums--;
                } else {
                    //2. 如果不是最后一个元素，就需要从找到下标的元素开始，让它的下一个元素值赋值给它，注意findstr + 1要小于图书数量减一，最后图书数量自减
                    for (int posi = findIndex; posi + 1 <= bookNums - 1; posi++) {
                        strArr[posi] = strArr[posi + 1];
                        if (posi + 1 == bookNums -1) {
                            strArr[bookNums - 1] = null;
                        }
                    }
                    bookNums--;
                }

                traverseElements(strArr, bookNums);

                System.out.print("\n是否还要删除[Y/N]：");
                char anwser = scanner.next().charAt(0);

                if (anwser == 'N')  flag = false;
            } else {
                System.out.println("\n您所要删除的图书并不存在~");
            }

            traverseElements(strArr, bookNums);
        }
    }

    private static void traverseElements(String[] strArr, int bookNums) {
        System.out.print("\n当前库内图书有" + bookNums + "本，分别是：");
        for (String elem : strArr) {
            System.out.print(elem != null ? elem + " " : "");
        }
    }
}