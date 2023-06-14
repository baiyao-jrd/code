package day23.caseDemo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/18:00
 * @Description:
 */
public class TestExtensibleArray {
    public static void main(String[] args) {
        ExtensibleArray extensibleArray = new ExtensibleArray(3);
        extensibleArray.add("江润冬");
        extensibleArray.add("江明阳");
        extensibleArray.add("江奇志");
        extensibleArray.add("王大妮");

        System.out.println("容器内元素个数: " + extensibleArray.size());

        System.out.println("容器内元素: ");
        Viewer view = extensibleArray.createView();
        while (view.hasNext()) {
            System.out.print(view.next() + " ");
        }

        extensibleArray.remove(1);

        System.out.println("容器内元素个数: " + extensibleArray.size());

        System.out.println("容器内元素: ");
        Viewer view1 = extensibleArray.createView();
        while (view1.hasNext()) {
            System.out.print(view1.next() + " ");
        }

        extensibleArray.set(1, "江明阳");

        System.out.println("容器内元素: ");
        Viewer view2 = extensibleArray.createView();
        while (view2.hasNext()) {
            System.out.print(view2.next() + " ");
        }

    }
}
