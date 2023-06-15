package day24.commonClasses.packagingClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/16:52
 * @Description:
 */
public class CharacterTest {
    public static void main(String[] args) {
        Character a = new Character('a');
        Character b = Character.valueOf('b');

        System.out.println(a + " -> " + b);
    }
}
