package day18.superKeywords;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/21:18
 * @Description:
 */
public class Student extends Person {
    private String id;

    public Student(String id, String name, String no) {
        super(id, name);
        this.id = no;
    }

    public String detail() {
        return "学号: " + id + ", 姓名: " + name + ", 身份证号: " + super.id;
    }
}
