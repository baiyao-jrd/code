package day26;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/11:04
 * @Description:
 */
public class TimeConsumingTest {
    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;

        startTime = System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 2000; i++) {
            stringBuffer.append(i);
        }

//        System.out.println(stringBuffer);

        endTime = System.currentTimeMillis();

        System.out.println((endTime - startTime));

        startTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 2000; i++) {
            stringBuilder.append(i);
        }

//        System.out.println(stringBuilder);

        endTime = System.currentTimeMillis();

        System.out.println((endTime - startTime));

        startTime = System.currentTimeMillis();

        String str = "";

        for (int i = 0; i < 2000; i++) {
            str += String.valueOf(i);
        }

//        System.out.println(str);

        endTime = System.currentTimeMillis();

        System.out.println((endTime - startTime));
    }
}
