package day23.enumClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/9:33
 * @Description:        定义枚举类
 *                          声明一个季节类，它包含名称和描述两个属性，并且只能有4个对象 -> 春、夏、秋、冬
 */
public class Season {
    private String name;
    private String description;

    public static final Season SPRING = new Season("春", "万物复苏");
    public static final Season SUMMER = new Season("夏", "艳阳高照");
    public static final Season AUTUMN = new Season("秋", "秋高气爽");
    public static final Season WINTER = new Season("冬", "白雪皑皑");

    private Season(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void detail() {
        System.out.println("季节: " + name + ", 特征: " + description);
    }
}
