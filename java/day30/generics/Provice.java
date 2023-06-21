package day30.generics;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/11:26
 * @Description:
 */
public class Provice {
    private int id;
    private String name;

    public Provice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Provice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
