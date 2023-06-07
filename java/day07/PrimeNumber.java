package day07;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/12/16:37
 * @Description: 找出(1, 100]间的所有素数 -> 除1和它本身不再有其他因子
 */
public class PrimeNumber {
    public static void main(String[] args) {
        outerLoop: for (int num = 2; num < 100; num++) {
            inneerLoop: for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    continue outerLoop;
                }
            }
            System.out.print(num + "\t");
        }
    }
}
