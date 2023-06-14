package day23.caseDemo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/17:08
 * @Description:
 */
public class FixedArray extends Array {

    public FixedArray(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public void add(Object obj) {
        if (total >= elements.length) {
            System.out.println("容器已满");
            return;
        }

        elements[total++] = obj;
    }
}
