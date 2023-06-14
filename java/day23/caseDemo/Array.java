package day23.caseDemo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/16:24
 * @Description:
 */
public abstract class Array implements Container, Viewable {
    protected Object[] elements;
    protected int total;

    private class InnerViewer implements Viewer {
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < total;
        }

        @Override
        public Object next() {
            return elements[cursor++];
        }
    }

    public Array(int initialCapacity) {
        elements = new Object[initialCapacity];
    }

    public int size() {
        return total;
    }

    public void remove(int index) {
        System.out.println("Array -> remove方法 -> " + index);

        if (index < 0 || index >= total) {
            System.out.println(index + "位置的下标元素不存在");
            return;
        }

        for (int i = index + 1; i < total; i++) {
            elements[i - 1] = elements[i];
        }
        elements[--total] = null;
    }

    public void set(int index, Object obj) {
        System.out.println("Array -> set方法 -> " + index + " -> " + obj.toString());

        if (index < 0 || index >= elements.length) {
            System.out.println(index + "位置的下标元素不存在");
            return;
        }

        elements[index] = obj;
    }

    @Override
    public Viewer createView() {
        return new InnerViewer();
    }
}
