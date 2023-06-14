package day23.caseDemo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/17:24
 * @Description:
 */
public class TestFixedArray {
    public static void main(String[] args) {
        FixedArray fixedArray = new FixedArray(3);
        fixedArray.add("江润冬");
        fixedArray.add("江明阳");
        fixedArray.add("江奇志");

        fixedArray.add("王大妮");

        System.out.println("元素个数: " + fixedArray.size());

        fixedArray.remove(0);

        System.out.println("元素个数: " + fixedArray.size());

        System.out.println("所有元素: ");

        Viewer view2 = fixedArray.createView();

        while (view2.hasNext()) {
            System.out.print(view2.next() + " ");
        }

        System.out.println("************************************");

        fixedArray.set(1, "马保国");

        System.out.println("所有元素: ");

        Viewer view = fixedArray.createView();

        while (view.hasNext()) {
            System.out.print(view.next() + " ");
        }
    }
}
