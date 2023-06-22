package day31.iostream.caseDemo3;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/13:37
 * @Description:
 */
public class Account implements Serializable {
    private static double interestRate;
    private String name;
    private transient String pwd;
    private String id;
    private double balance;

    public Account(String name, String pwd, String id, double balance) {
        this.name = name;
        this.pwd = pwd;
        this.id = id;
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }
}
