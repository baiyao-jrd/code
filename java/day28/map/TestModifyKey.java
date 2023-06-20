package day28.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/19/16:53
 * @Description:
 */
public class TestModifyKey {
    public static void main(String[] args) {
        HashMap<Data, Integer> map = new HashMap<>();

        Data data = new Data(1);
        map.put(data, 1);

        ergodic(map);

        data.setNumber(2);

        ergodic(map);

        System.out.println(map.get(data));
    }

    private static void ergodic(HashMap<Data, Integer> map) {
        for (Map.Entry<Data, Integer> entry : map.entrySet()) {
            System.out.print(entry + "\t");
        }
    }
}

class Data {
    private int number;

    public Data(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return number == data.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Data{" +
                "number=" + number +
                '}';
    }
}
