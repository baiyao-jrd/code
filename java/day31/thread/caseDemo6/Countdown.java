package day31.thread.caseDemo6;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/20:16
 * @Description:
 */
public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        int init = 10;

        while (true) {
            if (init <= 0) {
                System.out.println("2024, 你好啊！！！");
                break;
            }
            System.out.println(init--);
            Thread.sleep(1000);
        }
    }
}
