package day26.arrays.caseDemo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/15:03
 * @Description:
 */
public class MyArrayList implements Container {
    private Object[] al;
    int total = 0;

    public MyArrayList(int len) {
        if (len <= 0) {
            throw new IllegalArgumentException("初始化容量无效");
        }

        al = new Object[len];
    }

    public int getTotal() {
        return total;
    }

    @Override
    public void add(Object obj) {
        if (total >= al.length) {
            expansion();
        }

        al[total++] = obj;
    }

    @Override
    public void add(int index, Object obj) {
        if (index < 0 || index > total) {
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }

        if (total >= al.length) {
            expansion();
        }

        for (int i = total - 1; i >= index; i--) {
            al[i + 1] = al[i];
        }

        al[index] = obj;
        total++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= total) {
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }

        for (int i = index + 1; i < total; i++) {
            al[i - 1] = al[i];
        }
        al[--total] = null;
    }

    @Override
    public void remove(Object obj) {
        int index = -1;

        for (int i = 0; i < total; i++) {
            if (al[i].equals(obj)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index + 1; i < total; i++) {
                al[i - 1] = al[i];
            }
            al[--total] = null;
        }
    }

    @Override
    public void set(int index, Object obj) {
        if (index < 0 || index >= total) {
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }

        al[index] = obj;
    }

    @Override
    public void set(Object obj, Object newObj) {
        for (int i = 0; i < total; i++) {
            if (al[i].equals(obj)) {
                al[i] = newObj;
                return;
            }
        }
    }

    @Override
    public boolean contain(Object obj) {
        boolean flag = false;

        for (int i = 0; i < total; i++) {
            if (al[i].equals(obj)) {
                flag = true;
            }
        }

        return flag;
    }

    @Override
    public int indexOf(Object obj) {

        for (int i = 0; i < total; i++) {
            if (obj.equals(al[i])) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= total) {
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }

        return al[index];
    }

    @Override
    public int size() {
        return total;
    }

    @Override
    public Object[] getAll() {
        Object[] objects = new Object[total];

        for (int i = 0; i < total; i++) {
            objects[i] = al[i];
        }

        return objects;
    }

    public void expansion() {

        Object[] objects = new Object[al.length + (al.length >> 1)];
        for (int i = 0; i < al.length; i++) {
            objects[i] = al[i];
        }

        System.out.println(objects.length);

        al = objects;
    }
}
