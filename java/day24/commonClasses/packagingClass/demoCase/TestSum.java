package day24.commonClasses.packagingClass.demoCase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/17:27
 * @Description:
 */
public class TestSum {
    public static void main(String[] args) {
        try {
            System.out.println((Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
        } catch (NumberFormatException e) {
            System.out.println("参数必须是整数");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("保证有两个参数");
        }
    }
}
