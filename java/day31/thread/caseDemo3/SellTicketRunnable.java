package day31.thread.caseDemo3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/19:37
 * @Description:
 */
public class SellTicketRunnable implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets <= 0) {
                System.out.println("票已售完");
                break;
            }

            System.out.println(Thread.currentThread().getName() + " 卖出了一张票, 余票: " + (--tickets));
        }
    }
}
