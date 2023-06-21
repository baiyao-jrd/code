package day30.generics;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/11:27
 * @Description:
 */
public class City {
    private int id;
    private String name;
    private int pid;

    public City(int id, String name, int pid) {
        this.id = id;
        this.name = name;
        this.pid = pid;
    }

    public int getPid() {
        return pid;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                '}';
    }
}
