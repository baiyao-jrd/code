package day31.iostream.caseDemo3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/13:49
 * @Description:
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("java/day31/iostream/resources/Account.bat"));

        System.out.println(in.readObject());
        System.out.println(Account.getInterestRate());

        in.close();
    }
}
