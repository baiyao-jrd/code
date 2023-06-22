package day31.thread.caseDemo2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/19:25
 * @Description:
 */
public class SellTicketThread extends Thread {
    private int tickets = 100;

    public void run() {
        while (true) {
            if (tickets <= 0) {
                System.out.println("票已售完");
                break;
            }
            System.out.println(getName() + " 卖了一张票, 目前余票: " + (--tickets));
        }
    }
}
