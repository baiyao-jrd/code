package day31.iostream.caseDemo3;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/14:35
 * @Description:
 */
public class AccountSerializable implements Serializable {
    private static final long serialVersionUID = 1L;

    private static double interestRate;
    private String id;
    private String name;
    private String pwd;
    private double balance;

    public AccountSerializable(String id, String name, String pwd, double balance) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        AccountSerializable.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "AccountSerializable{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
