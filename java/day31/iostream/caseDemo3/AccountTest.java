package day31.iostream.caseDemo3;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/13:40
 * @Description:
 */
public class AccountTest {
    public static void main(String[] args) throws IOException {
        Account.setInterestRate(0.0024);

        Account a = new Account("江润冬", "run123123", "888", 10000.0);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("java/day31/iostream/resources/Account.bat"));

        out.writeObject(a);

        out.close();
    }
}
