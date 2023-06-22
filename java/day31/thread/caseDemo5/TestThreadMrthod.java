package day31.thread.caseDemo5;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/20:02
 * @Description:
 */
public class TestThreadMrthod {
    public static void main(String[] args) {
        Runnable a = new Runnable() {
            private int tickets = 100;

            @Override
            public void run() {
                while (true) {
                    if (tickets <= 0) {
                        System.out.println("票已售完");
                        break;
                    }

                    System.out.println(Thread.currentThread().getName() + " 售了一张票, 余票: " + (--tickets));
                }
            }
        };

        Thread b = new Thread(a, "普通窗口");
        b.setPriority(Thread.MIN_PRIORITY);

        Thread c = new Thread(a, "紧急窗口");
        c.setPriority(Thread.MAX_PRIORITY);

        System.out.println(b + " " + b.getPriority());
        System.out.println(c + " " + c.getPriority());
        System.out.println("main " + Thread.currentThread().getPriority());

        b.start();
        c.start();
    }
}
