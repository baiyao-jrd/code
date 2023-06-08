package day18.methodRewriting;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/21:05
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Person per = new Person("江润冬", 28);
        System.out.println(per.detail());

        Student stu = new Student("江明阳", 18, 99.0);
        System.out.println(stu.detail());
    }
}
