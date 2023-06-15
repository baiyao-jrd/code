package day24.throwKeywords.DemoCase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/10:07
 * @Description:
 */
public class CountDown {
    public static void main(String[] args) {
        try {

            System.out.print("倒计时开始: ");

            for (int i = 10; i >= 0; i--) {
                System.out.print(i + " ");

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread.sleep 中断异常");
        }
    }
}
