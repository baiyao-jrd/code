package day24.commonClasses.objectClass.toStringMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/14:56
 * @Description:
 */
public class NewPerson {
    private String name;
    private int age;

    public NewPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
