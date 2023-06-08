package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/20:31
 * @Description:
 */
public class EmployeeExtends extends Person {
    private double salary;

    public String getDetail() {
        return getBasicDetail() + ", 薪资: " + salary;
    }

    public void work() {
        System.out.println("好好赚钱, 好好还贷~~");
    }
}
