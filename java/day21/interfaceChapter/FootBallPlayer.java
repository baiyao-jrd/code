package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/14:35
 * @Description:
 */
public class FootBallPlayer extends Sporter implements LearnEnglish{
    @Override
    public void LearnEnglish() {
        System.out.println("足球运行员学习英语");
    }

    @Override
    public void train() {
        System.out.println("足球运动员进行训练");
    }

    @Override
    public void play() {
        System.out.println("足球运行员进行比赛");
    }
}
