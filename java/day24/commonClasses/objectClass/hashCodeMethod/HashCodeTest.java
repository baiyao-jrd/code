package day24.commonClasses.objectClass.hashCodeMethod;

import day24.commonClasses.objectClass.equalsMethod.Person;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/16:02
 * @Description:
 */
public class HashCodeTest {
    public static void main(String[] args) {
        Person a = new Person("江润冬", 27);
        Person b = new Person("江润冬", 27);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));

        System.out.println("****************************");

        NewPerson c = new NewPerson("江明阳", 23);
        NewPerson d = new NewPerson("江明阳", 23);

        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c.equals(d));
    }
}
