package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/12:00
 * @Description:
 */
public class BasketballPlayer extends Sporter {
    @Override
    public void train() {
        System.out.println("篮球运动员训练");
    }

    @Override
    public void play() {
        System.out.println("篮球运动员比赛");
    }
}
