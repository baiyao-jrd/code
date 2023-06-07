package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/10:18
 * @Description:
 */
public class Human {
    int id;
    String name;
    int age;
    long tel;

    public Human() {
    }

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Human(int id, String name, int age, long tel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", tel=" + tel +
                '}';
    }
}
