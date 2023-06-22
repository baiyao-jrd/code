package day31.thread.caseDemo4;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/19:54
 * @Description:
 */
public class TestThreadMethod {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i <= 100; i += 2) {
                    System.out.println(Thread.currentThread().getName() + " 线程: " + i);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i += 2) {
                    System.out.println(Thread.currentThread().getName() + "线程: " + i);
                }
            }
        }).start();
    }
}
