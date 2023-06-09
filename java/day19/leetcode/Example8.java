package day19.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/11:38
 * @Description:
 */
public class Example8 {
    public static int countSeniors(String[] details) {
        int flag = 0;

        for (String detail : details) {
            if (detail.charAt(11) - 48 > 6 || (detail.charAt(11) - 48 == 6 && detail.charAt(12) - 48 != 0))
                flag++;
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
        System.out.println(countSeniors(new String[]{"1313579440F2036","2921522980M5644"}));
        System.out.println(countSeniors(new String[]{"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"}));
    }
}
