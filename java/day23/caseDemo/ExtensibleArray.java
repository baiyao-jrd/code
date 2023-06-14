package day23.caseDemo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/17:17
 * @Description:
 */
public class ExtensibleArray extends Array {
    public ExtensibleArray(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public void add(Object obj) {
        if (total >= elements.length) {
            Object[] objects = new Object[elements.length + (elements.length >> 1)];

            for (int i = 0; i < elements.length; i++) {
                objects[i] = elements[i];
            }

            elements = objects;
        }

        elements[total++] = obj;
    }
}
