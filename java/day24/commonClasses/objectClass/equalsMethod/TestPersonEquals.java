package day24.commonClasses.objectClass.equalsMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/15:11
 * @Description:
 */
public class TestPersonEquals {
    public static void main(String[] args) {
        Person o = new Person("江润冬", 28);
        Person b = new Person("江润冬", 28);

        System.out.println(o.equals(b));

        System.out.println("**********************************");

        NewPerson m = new NewPerson("江明阳", 22);
        NewPerson n = new NewPerson("江明阳", 22);

        System.out.println(m.equals(n));

    }
}
