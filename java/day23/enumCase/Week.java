package day23.enumCase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/10:35
 * @Description:
 */
public enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static Week getByValue(int num) {
        Week[] values = Week.values();

        if (num <= values.length && num > 0) {
            return values[num - 1];
        } else {
            return null;
        }
    }
}
