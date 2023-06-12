package day21.interfaceChapter.practice;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/16:48
 * @Description:
 */
public class TeacherTest {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher("江润冬", 10000);
        teachers[1] = new Teacher("江奇志", 40000);
        teachers[2] = new Teacher("王大妮", 30000);

        MyArrays.bubbleSort(teachers);
    }
}
