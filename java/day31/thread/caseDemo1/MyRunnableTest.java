package day31.thread.caseDemo1;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/19:15
 * @Description:
 */
public class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable a = new MyRunnable();
        new Thread(a).start();

        MyRunnable b = new MyRunnable();
        new Thread(b).start();

        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + " 线程: " + i);
        }
    }
}
