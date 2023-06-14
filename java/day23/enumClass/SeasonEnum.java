package day23.enumClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/9:53
 * @Description:
 */
public enum SeasonEnum implements Display {
    SPRING("春", "青山绿水") {
        public void show() {
            System.out.println("春天到了, 万物复苏！");
        }
    },
    SUMMER("夏", "艳阳高照"),
    AUTUMN("秋", "秋高气爽"),
    WINTER;

    private String name;
    private String description;

    SeasonEnum() {
    }

    SeasonEnum(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void show() {
        System.out.println("季节: " + name + ", 特征: " + description);
    }
}
