package day23.handlingException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/22:52
 * @Description:
 */
public enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THUSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static Week getByValue(int value) {
        Week[] values = Week.values();

        if (value >= 1 && value <= 7) {
            return values[value - 1];
        }
        return null;
    }
}
