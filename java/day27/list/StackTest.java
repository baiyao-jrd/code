package day27.list;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/14:40
 * @Description:
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        showPush(stack, "江润冬");
        showPush(stack, "江润冬");
        showPush(stack, "江明阳");
        showPush(stack, "江奇志");
        showPush(stack, "王大妮");

        for (int i = 0; i < 8; i++) {
            try {
                showPop(stack);
            } catch (EmptyStackException e) {
                System.out.println("栈空");
            }
        }

        System.out.println();

        System.out.println(stack);
    }

    public static void showPush(Stack st, Object obj) {
        st.push(obj);

        System.out.println("当前的栈顶元素是: " + st.peek());

        System.out.println("当前栈中元素有: " + st);
    }

    public static void showPop(Stack st) {
        System.out.println(st.pop());

        System.out.println("当前栈顶元素: " + st.peek());
        System.out.println("当前栈中元素: " + st);
    }
}
