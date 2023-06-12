package day21.interfaceChapter.practice;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/16:40
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("江润冬", 99);
        students[1] = new Student("江明阳", 100);
        students[2] = new Student("江奇志", 98);

        MyArrays.bubbleSort(students);
    }
}
