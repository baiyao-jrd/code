package day25.stringClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/16/18:22
 * @Description:   可变字符序列
 */
public class AppendTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append("江润冬").append("江明阳").append("baiYao").append(true);
        System.out.println(stringBuffer);

        StringBuffer a = new StringBuffer("bai");
        a.insert(0, "niHao");
//        a.insert(9, "la");
        a.replace(5, 6, "***");
        a.delete(5, 7);
        System.out.println(a);
        System.out.println(a.reverse());
    }
}
