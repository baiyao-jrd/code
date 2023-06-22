package day31.thread.caseDemo1;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/19:12
 * @Description:
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + " 线程: " + i);
        }
    }
}
