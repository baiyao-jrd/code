package day03;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/17:41
 * @Description: 征婚 -> 练习多条件判断语句 -> 注意条件之间有包含关系的话，要遵守子上父下的原则
 *
 * 案例在Page74~75
 */
public class MarriageSeeking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("身高（cm）: ");
        int height = scanner.nextInt();

        System.out.println("资产（千万）: ");
        double property = scanner.nextDouble();

        System.out.println("帅吗（true/false）: ");
        Boolean handsome = scanner.hasNextBoolean();

        if(handsome) {
            System.out.println("必须嫁~");
        } else if (property >= 1) {
            System.out.println("不错，衣食无忧~");
        } else if (height >= 180) {
            System.out.println("嫁，上不足下有余~");
        } else {
            System.out.println("不嫁！");
        }
    }
}
