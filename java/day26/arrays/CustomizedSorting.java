package day26.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/12:12
 * @Description:
 */
public class CustomizedSorting {
    public static void main(String[] args) {
        NewPerson[] newPeople = {new NewPerson("zhangSan", 23), new NewPerson("liSi", 12), new NewPerson("wangErMaZi", 55)};
        Arrays.sort(newPeople, new Comparator<NewPerson>() {
            @Override
            public int compare(NewPerson o1, NewPerson o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(Arrays.toString(newPeople));

        Arrays.sort(newPeople, new Comparator<NewPerson>() {
            @Override
            public int compare(NewPerson o1, NewPerson o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(Arrays.toString(newPeople));
    }
}
