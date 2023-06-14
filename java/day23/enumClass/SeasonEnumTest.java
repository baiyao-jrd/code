package day23.enumClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/10:08
 * @Description:
 */
public class SeasonEnumTest {
    public static void main(String[] args) {
        SeasonEnum.SPRING.show();
        SeasonEnum.SUMMER.show();
        SeasonEnum.AUTUMN.show();
        SeasonEnum.WINTER.show();

        SeasonEnum summer = SeasonEnum.SUMMER;
        summer.show();
        System.out.println(summer.getName());

        SeasonEnum spring = SeasonEnum.SPRING;
        System.out.println(spring.getDescription());

        System.out.println("------------------------------------");

        System.out.println(SeasonEnum.SPRING);
        System.out.println(SeasonEnum.SPRING.getName());
        System.out.println(SeasonEnum.SPRING.ordinal());
        SeasonEnum[] values = SeasonEnum.values();
        for (SeasonEnum value : values) {
            value.show();
            System.out.println();
        }

        SeasonEnum.valueOf("SPRING").show();
    }
}
