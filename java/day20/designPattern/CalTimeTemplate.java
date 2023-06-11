package day20.designPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/23:59
 * @Description:
 */
public abstract class CalTimeTemplate {
    public final long getTime() throws InterruptedException {
        long start = System.currentTimeMillis();

        doWork();

        long end = System.currentTimeMillis();

        return end - start;
    }

    protected abstract void doWork() throws InterruptedException;
}
