package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/14:50
 * @Description:
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println("---------------所有运动员对象---------------");
        Sporter[] sporters = new Sporter[2];
        sporters[0] = new BasketballPlayer();
        sporters[1] = new FootBallPlayer();

        for (Sporter sporter : sporters) {
            sporter.train();
            sporter.play();
        }

        System.out.println("---------------所有学生对象---------------");
        Student[] students = new Student[2];
        students[0] = new pupil();
        students[1] = new UniversityStudent();

        for (Student student : students) {
            student.study();
            student.test();
            if (student instanceof LearnComputer)
                ((LearnComputer) student).LearnComputer();
        }

        System.out.println("---------------所有学英语的对象---------------");
        LearnEnglish[] learnEnglishes = new LearnEnglish[2];
        learnEnglishes[0] = new FootBallPlayer();
        learnEnglishes[1] = new UniversityStudent();

        for (LearnEnglish learnEnglish : learnEnglishes) {
            learnEnglish.LearnEnglish();
        }
    }
}
