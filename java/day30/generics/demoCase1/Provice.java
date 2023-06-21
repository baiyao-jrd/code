package day30.generics.demoCase1;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/12:27
 * @Description:
 */
public class Provice implements Comparable<Provice> {
    private int id;
    private String name;

    public Provice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Provice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Provice o) {
        return id - o.id;
    }
}
