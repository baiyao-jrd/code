package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/11:52
 * @Description:
 */
public class EmployeeAll {
    private String name;
    private int age;
    private boolean married;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean getMarried() {
        return married;
    }

    @Override
    public String toString() {
        return "EmployeeAll{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                '}';
    }
}
