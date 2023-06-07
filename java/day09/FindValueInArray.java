package day09;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/14/16:06
 * @Description: 输入学生姓名与成绩，分别用两个数组存 -> 查找某个名字的成绩 -> 存在，输出成绩；不存在，提示不存在。
 */
public class FindValueInArray {
    public static void main(String[] args) {
        //1. 输入学生的人数，分别用字符串数组与int数组存姓名和成绩
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学生人数：");
        int stuNum = scanner.nextInt();

        String[] stuNames = new String[stuNum];
        int[] stuScores = new int[stuNum];

        for (int i = 0; i < stuNum; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的姓名：");
            stuNames[i] = scanner.next();

            System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
            stuScores[i] = scanner.nextInt();

            System.out.println();
        }

        //2. 输入姓名，在String数组中查找姓名对应的索引值
        System.out.print("请输入要查找的学生的姓名：");
        String searchStuName = scanner.next();
        int position = -1;

        for (int index = 0; index < stuNames.length; index++) {
            if (searchStuName.equals(stuNames[index])) {
                position = index;
                break;
            }
        }

        //3. 通过索引值遍历int数组，找到对应成绩并输出 -> 找不到就提示不存在该学生，找到就返回索引值
        System.out.println(position == -1 ? "未查询到该学生的信息~" : stuNames[position] + "的成绩为：" + stuScores[position]);
    }
}