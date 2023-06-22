package day31.thread;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/19:04
 * @Description:
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + " 线程: " + i);
        }
    }
}
