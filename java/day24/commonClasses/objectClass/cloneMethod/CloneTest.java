package day24.commonClasses.objectClass.cloneMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/16:28
 * @Description:
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Person a = new Person("江润冬", 27);
            Object b = a.clone();

            System.out.println(a == b);
            System.out.println(a.equals(b));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
