package day04;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/09/18:08
 * @Description: 输入一个10以内的数，然后与随机生成的数作比较，直到猜对为止结束，并统计猜测次数。
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum,randomNum;
        do {
            System.out.print("请输入一个10以内的数字：");

            inputNum = scanner.nextInt();

            randomNum = (int)(Math.random() * 10);

            System.out.println("随机生成的数是: " + randomNum + ((inputNum > randomNum) ? ", 您猜大了~" : ((inputNum < randomNum) ? ", 您猜小了~" : ", 您猜对了~")));
        } while (inputNum != randomNum);
    }
}
