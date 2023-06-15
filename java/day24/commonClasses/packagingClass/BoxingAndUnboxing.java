package day24.commonClasses.packagingClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/17:04
 * @Description:
 */
public class BoxingAndUnboxing {
    public static void main(String[] args) {
        // 装箱
        Integer integer = Integer.valueOf(100);
        Integer b = 200;
        // 拆箱
        int a = integer.intValue();
        int c = integer;

        // 编译报错
//        Double e = integer;

        double d = integer;
    }
}
