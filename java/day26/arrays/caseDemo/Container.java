package day26.arrays.caseDemo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/14:54
 * @Description:
 */
public interface Container {
    void add(Object obj);
    void add(int index, Object obj);
    void remove(int index);
    void remove(Object obj);
    void set(int index, Object obj);
    void set(Object obj, Object newObj);
    boolean contain(Object obj);
    int indexOf(Object obj);
    Object get(int index);
    int size();
    Object[] getAll();
}
