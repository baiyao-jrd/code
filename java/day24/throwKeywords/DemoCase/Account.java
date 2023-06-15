package day24.throwKeywords.DemoCase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/11:43
 * @Description:
 */
public class Account {
    private final String id;
    private final String name;
    private double balance;


    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String detail() {
        return "账号: " + id + ", 户主名: " + name + ", 余额: " + balance;
    }

    public void save(double money) {
        if (money <= 0) {
            throw new IllegalArgumentException("存款金额不能为零或负数");
        } else {
            balance += money;
        }
    }

    public void withdraw(double money) {
        if (money <= 0) {
            throw new IllegalArgumentException("取款金额不能为零或负数");
        } else if (money > balance) {
            throw new UnsupportedOperationException("余额不足, 不支持本次取款操作");
        } else {
            balance -= money;
        }
    }
}
