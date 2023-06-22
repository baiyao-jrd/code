package day31.thread;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/18:58
 * @Description:
 */
public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(getName() + " 线程: " + i);
        }
    }
}
