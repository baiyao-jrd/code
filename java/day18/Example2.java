package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/11:34
 * @Description:
 */
public class Example2 {
    public static int countAsterisks(String s) {
        StringBuilder str = new StringBuilder();
        int flag = 0;

        for (int i = 0; i < s.split("\\|").length; i++) {
            if (i % 2 == 0)
                str.append ((s.split("\\|"))[i]);
        }

        for (String string : str.toString().split("")) {
            if ("*".equals(string))
                flag++;
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));
        System.out.println(countAsterisks("iamprogrammer"));
        System.out.println(countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }
}
