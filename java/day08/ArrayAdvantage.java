package day08;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/13/16:52
 * @Description: 使用数组来实现此需求
 */
public class ArrayAdvantage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入小组的人数：");
        int num = scanner.nextInt();

        int[] grades = new int[num];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("请输入第" + (i + 1) + "名成员的成绩：");
            grades[i] = scanner.nextInt();
        }

        int maxGrade = Integer.MIN_VALUE;
        int minGrade = Integer.MAX_VALUE;

        for (int grade : grades) {
            if (grade > maxGrade)  maxGrade = grade;
            if (grade < minGrade) minGrade = grade;
        }

        System.out.println("小组成员的最高成绩为：" + maxGrade + ", 最低成绩为：" + minGrade);

        for (int i = 0; i < grades.length; i++) {
            for (int j = grades.length - 1; j > i; j--) {
                if (grades[j] > grades[i]) {
                    int temp = grades[i];
                    grades[i] = grades[j];
                    grades[j] = temp;
                }
            }
        }

        System.out.print("小组成员的成绩从高到低排列为: ");
        for (int grade : grades) {
            System.out.print(grade + "\t");
        }
    }
}
