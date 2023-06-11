package day20.designPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/0:05
 * @Description:    冒泡排序
 */
public class CalTime extends CalTimeTemplate{
    @Override
    protected void doWork() throws InterruptedException {
        int[] intArr = {1, 5, 18, 5, 3, -1, -6, 45, 12};

        ergodic(intArr);

        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }
        }

        ergodic(intArr);

        Thread.sleep(1000);
    }

    public static void ergodic(int[] intArr){
        for (int i : intArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
