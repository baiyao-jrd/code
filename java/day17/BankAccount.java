package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/16:31
 * @Description:    银行账户类
 *                      利率、账号、户名、身份证号、手机号、余额
 */
public class BankAccount {
    private static double rate;
    private String nums;
    private String name;
    private String id;
    private long phoneNum;
    private double money;

    public BankAccount() {
    }

    public BankAccount(String nums, String name, String id, long phoneNum, double money) {
        this.nums = nums;
        this.name = name;
        this.id = id;
        this.phoneNum = phoneNum;
        this.money = money;
    }

    public static void setRate(double rate) {
        BankAccount.rate = rate;
    }

    public void setNums(String nums) {
        this.nums = nums;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public static double getRate() {
        return rate;
    }

    public String getNums() {
        return nums;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "rate='" + rate + '\'' +
                ", nums='" + nums + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneNum=" + phoneNum +
                ", money=" + money +
                '}';
    }
}
