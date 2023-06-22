package day31.thread.caseDemo2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/19:29
 * @Description:
 */
public class SellTicketThreadTest {
    public static void main(String[] args) {
        SellTicketThread a = new SellTicketThread();
        SellTicketThread b = new SellTicketThread();
        SellTicketThread c = new SellTicketThread();

        a.start();
        b.start();
        c.start();
    }
}
