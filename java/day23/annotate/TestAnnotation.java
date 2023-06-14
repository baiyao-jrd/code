package day23.annotate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/11:19
 * @Description:
 */
public class TestAnnotation {
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        Flyable.fei();

        Bird bird = new Bird();
        bird.fly();
    }
}

interface Flyable {

    // 标记fei()方法已过时，不建议使用
    @Deprecated
    static void fei() {
        System.out.println("飞得更高");
    }

    void fly();
}

class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("摔得更惨~~");
    }
}