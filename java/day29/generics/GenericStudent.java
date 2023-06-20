package day29.generics;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/11:25
 * @Description:
 */
public class GenericStudent<T extends Number> {
    private String name;
    private T score;

    public GenericStudent(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "GenericStudent{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
