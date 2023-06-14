package day23.caseDemo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/16:17
 * @Description:
 */
public interface Container {
    void add(Object obj);
    void remove(int index);
    void set(int index, Object obj);
}
