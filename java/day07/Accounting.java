package day07;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/12/17:15
 * @Description: 综合案例练习 -> 家庭收支记账软件
 *
 * 初始本金10000
 * 2 -> 为收入 -> 累加至本金
 * 3 -> 为支出 -> 从本金扣除
 * 1 -> 显示所有收入支出明细
 * 4 -> 退出系统
 */
public class Accounting {
    public static void main(String[] args) {
        int choice;
        long principal = 10000;
        StringBuilder detailed = new StringBuilder();

        do {
            System.out.println("------------ 家庭收支记账软件 ------------");
            System.out.println("\t\t\t 1 收 支 明 细");
            System.out.println("\t\t\t 2 登 记 收 入");
            System.out.println("\t\t\t 3 登 记 支 出");
            System.out.println("\t\t\t 4 退   " + ' ' + "  出");
            System.out.print("请选择( 1 ~ 4 ): ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    {
                        System.out.println("------------ 当前收支明细记录 ------------");
                        System.out.println("收支" + "\t\t" + "账户金额" + "\t\t" + "收支金额" + "\t\t" + "说明");
                        System.out.println(detailed);
                    }
                    System.out.println();
                    continue;
                case 2:
                    {
                        System.out.print("本次收入金额：");
                        long income = scanner.nextLong();
                        principal += income;

                        System.out.print("本次收入说明：");
                        String explanation = scanner.next();

                        detailed.append("收入\t\t" + principal + "\t\t" + income + "\t\t" + explanation + "\n");
                    }
                    System.out.println();
                    continue;
                case 3:
                    {
                        System.out.print("本次支出金额：");
                        long pay = scanner.nextLong();
                        principal -= pay;

                        System.out.print("本次支出说明：");
                        String explanation = scanner.next();

                        detailed.append("支出\t\t" + principal + "\t\t" + pay + "\t\t" + explanation + "\n");
                    }
                    System.out.println();
                    continue;
                default:
                    if (choice != 4)   System.out.println("选项有误，请重新输入~");
                    System.out.println();
            }
        } while (choice != 4);
    }
}