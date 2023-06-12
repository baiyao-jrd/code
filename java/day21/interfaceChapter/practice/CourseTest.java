package day21.interfaceChapter.practice;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/16:51
 * @Description:
 */
public class CourseTest {
    public static void main(String[] args) {
        Course[] courses = new Course[3];
        courses[0] = new Course(11, "语文");
        courses[1] = new Course(5, "数学");
        courses[2] = new Course(3, "外语");

        MyArrays.bubbleSort(courses);
    }
}
