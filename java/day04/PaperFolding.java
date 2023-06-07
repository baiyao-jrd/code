package day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/09/17:21
 * @Description: 0.1mm的纸对折多少次才可以对折到8848860mm -> while语句练习
 */
public class PaperFolding {
    public static void main(String[] args) {
        int count = 0;

        double originPaperHeight = 0.1;
        double currentPaperHeight = originPaperHeight;

        while ( currentPaperHeight < 8848860 ) {
            currentPaperHeight *= 2;
            count++;
        }

        System.out.println("0.1mm的纸对折" + count + "次之后才达到了珠穆朗玛8848.86米的高度~");
    }
}
