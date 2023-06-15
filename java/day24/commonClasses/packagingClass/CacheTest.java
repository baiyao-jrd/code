package day24.commonClasses.packagingClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/17:42
 * @Description:    包装类的缓存对象
 */
public class CacheTest {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);

        System.out.println(a == b);

        Integer i = 1;
        Integer j = 1;

        System.out.println(i == j);

        Integer c = 128;
        Integer d = 128;

        System.out.println(c == d);

        int e = 127;
        Integer f = 127;

        System.out.println(e == f);

        int g = 128;
        Integer h = 128;
        System.out.println(g == h);
    }
}
