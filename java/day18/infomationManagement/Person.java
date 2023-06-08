package day18.infomationManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/21:31
 * @Description:
 */
public class Person {
    private String name;
    private long phoneNum;
    private String id;

    public Person() {
    }

    public Person(String name, long phoneNum, String id) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String detail() {
        return "姓名: " + name + ", 电话: " + phoneNum + ", 身份证号: " + id;
    }
}
