package day26.arrays;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/12:31
 * @Description:
 */
public class OldPersonTest {
    public static void main(String[] args) {
        OldPerson[] a = {new OldPerson("zhangsan", 21), new OldPerson("lisi", 32)};
        OldPerson[] b = {new OldPerson("zhangsan", 21), new OldPerson("lisi", 32)};

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i].equals(b[i]));
//        }

        System.out.println(Arrays.equals(a, b));
    }
}
