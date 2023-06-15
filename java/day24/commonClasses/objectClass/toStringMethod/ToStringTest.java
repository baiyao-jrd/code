package day24.commonClasses.objectClass.toStringMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/14:54
 * @Description:
 */
public class ToStringTest {
    public static void main(String[] args) {
        Person p = new Person("江润冬", 27);
        System.out.println(p);
        System.out.println("*****************");
        System.out.println(p.toString());

        System.out.println("-------------------------------------------------------");

        NewPerson q = new NewPerson("江明阳", 22);
        System.out.println(q);
    }
}
