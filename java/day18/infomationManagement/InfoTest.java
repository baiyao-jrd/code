package day18.infomationManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/21:37
 * @Description:
 */
public class InfoTest {
    public static void main(String[] args) {
        Employee emp = new Employee("江润冬", 18303620306l, "410323199609235589", 10000);
        System.out.println(emp.detail());

        Student stu = new Student("江明阳", 15090184774l, "410323199609236677", 99.9);
        System.out.println(stu.detail());
    }
}
