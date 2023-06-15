package day24.commonClasses.objectClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/14:45
 * @Description:
 */
public class TestObject {
    public static void main(String[] args) {
        Object o = new Object();
        Object p = "白药";
        TestObject q = new TestObject();

        Object r = new int[3];

        Object[] objects = new Object[3];
        Object[] a = new String[4];

          // 非对象数组, 编译不通过
//        Object[] b = new int[5];
    }
}
