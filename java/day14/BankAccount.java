package day14;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/20/16:04
 * @Description: 银行账户类 -> 账号、户名、身份证号、手机号、余额、利率 -> 利率统一为0.035
 */
public class BankAccount {
    String accountNum;
    String name;
    String id;
    Long phoneNum;
    double balance;
    static double interestRate = 0.035;
}
