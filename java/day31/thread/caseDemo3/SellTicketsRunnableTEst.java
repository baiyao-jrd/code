package day31.thread.caseDemo3;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/19:40
 * @Description:
 */
public class SellTicketsRunnableTEst {
    public static void main(String[] args) {
        SellTicketRunnable r = new SellTicketRunnable();

        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
    }
}
