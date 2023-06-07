package day08;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/13/15:10
 * @Description: 输入3个学员的成绩 -> 找出最高分、最低分 -> 并将成绩由高到低排序
 *
 * 不是用数组的情况下实现这个需求
 */
public class NoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个学员的成绩：");
        int gradeOne = scanner.nextInt();

        System.out.println("请输入第二个学员的成绩：");
        int gradeTwo = scanner.nextInt();

        System.out.println("请输入第三个学员的成绩：");
        int gradeThree = scanner.nextInt();

        int maxGrade = Integer.MIN_VALUE;
        maxGrade = maxGrade >= gradeOne ? maxGrade : gradeOne;
        maxGrade = maxGrade >= gradeTwo ? maxGrade : gradeTwo;
        maxGrade = maxGrade >= gradeThree ? maxGrade : gradeThree;

        System.out.println("三个学员的最高成绩：" + maxGrade);

        int minGrade = Integer.MAX_VALUE;
        minGrade = minGrade <= gradeOne ? minGrade : gradeOne;
        minGrade = minGrade <= gradeTwo ? minGrade : gradeTwo;
        minGrade = minGrade <= gradeThree ? minGrade : gradeThree;

        System.out.println("三个学员的最低成绩：" + minGrade);

        if (gradeOne >= gradeTwo && gradeTwo <= gradeThree) {
            System.out.println(gradeOne + " -> " + gradeTwo + " -> " + gradeThree);
        } else if (gradeOne >= gradeThree && gradeThree >= gradeTwo) {
            System.out.println(gradeOne + " -> " + gradeThree + " -> " + gradeTwo);
        } else if (gradeTwo >= gradeOne && gradeOne >= gradeThree) {
            System.out.println(gradeTwo + " -> " + gradeOne + " -> " + gradeThree);
        } else if (gradeTwo >= gradeThree && gradeThree >= gradeOne) {
            System.out.println(gradeTwo + " -> " + gradeThree + " -> " + gradeOne);
        } else if (gradeThree >= gradeOne && gradeOne >= gradeTwo) {
            System.out.println(gradeThree + " -> " + gradeOne + " -> " + gradeTwo);
        } else {
            System.out.println(gradeThree + " -> " + gradeTwo + " -> " + gradeOne);
        }
    }
}
