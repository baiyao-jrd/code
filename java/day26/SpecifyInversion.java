package day26;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/11:15
 * @Description:    将字符串中指定部分进行反转, 比如将字符串"abcdefgho"的[2, 6)部分反转, 结果为"abfedcgho"
 */
public class SpecifyInversion {
    public static void main(String[] args) {
        System.out.println(strSpecifyInversion("abcdefgho", 2, 6));
        System.out.println(strSpecify("abcdefgho", 2, 6));
    }

    public static String strSpecifyInversion(String str, int fromIndex, int toIndex) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(0, fromIndex));
        stringBuilder.append(new StringBuilder().append(str.substring(fromIndex, toIndex)).reverse());
        stringBuilder.append(str.substring(toIndex));

        return stringBuilder.toString();
    }

    public static String strSpecify(String str, int fromIndex, int toIndex) {
        String preSub = str.substring(0, fromIndex);

        String[] split = str.substring(fromIndex, toIndex).split("");

        for (int i = 0, j = split.length - 1; i < split.length / 2; i++, j--) {
            String temp = split[i];
            split[i] = split[j];
            split[j] = temp;
        }

        for (String s : split) {
            preSub += s;
        }

        String tailSub = str.substring(toIndex);

        return preSub.concat(tailSub);
    }
}
