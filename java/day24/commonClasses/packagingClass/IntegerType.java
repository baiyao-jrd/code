package day24.commonClasses.packagingClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/16:36
 * @Description:
 */
public class IntegerType {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = new Integer("100");

        System.out.println(a + " -> " + b);

        Integer c = Integer.valueOf(20);
        Integer d = Integer.valueOf("30");

        System.out.println(c + " -> " + d);

        int intValue = 10;
        System.out.println(intValue + "");
        System.out.println(String.valueOf(intValue));

        String strValue = "521";
        int e = Integer.parseInt(strValue);
        System.out.println(e);

        double f = Double.parseDouble(strValue);
        System.out.println(f);
    }
}
