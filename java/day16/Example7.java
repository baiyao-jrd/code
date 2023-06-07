package day16;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/1:01
 * @Description:
 */
public class Example7 {
    public static boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }

    public static void main(String[] args) {

    }
}
