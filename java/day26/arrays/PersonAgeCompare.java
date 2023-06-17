package day26.arrays;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/12:02
 * @Description:
 */
public class PersonAgeCompare {
    public static void main(String[] args) {
        Person[] people = {new Person("江润冬", 25), new Person("江明阳", 22), new Person("江奇志", 52)};

        Arrays.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
