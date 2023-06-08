package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/16:41
 * @Description:
 */
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount.setRate(0.035);

        System.out.println(new BankAccount("6217994980026758085", "江润冬", "410323199609236612", 18303620306l, 10000.0));
    }
}
