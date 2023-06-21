package day30.generics.demoCase1;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/12:29
 * @Description:
 */
public class City implements Comparable<City> {
    private int id;
    private String name;
    private int pid;

    public City(int id, String name, int pid) {
        this.id = id;
        this.name = name;
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                '}';
    }

    @Override
    public int compareTo(@NotNull City o) {
        return id - o.id;
    }
}
