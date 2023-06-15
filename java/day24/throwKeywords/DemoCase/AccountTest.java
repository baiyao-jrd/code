package day24.throwKeywords.DemoCase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/13:35
 * @Description:
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("621799", "江润冬", 10000);
        System.out.println("当前账号信息: " + account.detail());

        try {
            account.save(-10000);
//            account.withdraw(15000);
            System.out.println("存款成功");
        } catch (Exception e) {
            System.out.println("存款失败: " + e.getMessage());
        } finally {
            System.out.println("当前账号信息: " + account.detail());
        }
    }
}
