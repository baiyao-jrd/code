package day22.comparatorInterface;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/12/19:20
 * @Description:
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("01", "江润冬", 26, 97.5);
        students[1] = new Student("08", "江明阳", 22, 99.6);
        students[2] = new Student("10", "江奇志", 52, 99.8);
        students[3] = new Student("05", "王大妮", 51, 98.0);

        System.out.println("-----------id排序------------");
        for (Student student : ArraySort.returnFlag(students, new Comparator() {
            @Override
            public int sort(Object a, Object b) {
                return Integer.parseInt(((Student) a).getId()) - Integer.parseInt(((Student) b).getId());
            }
        })) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("-----------age排序------------");
        for (Student student : ArraySort.returnFlag(students, new Comparator() {
            @Override
            public int sort(Object a, Object b) {
                return Integer.parseInt(((Student) a).getAge() + "") - Integer.parseInt(((Student) b).getAge() + "");
            }
        })) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("-----------score排序------------");
        for (Student student : ArraySort.returnFlag(students, new Comparator() {
            @Override
            public int sort(Object a, Object b) {
                return (int)(((Student) a).getScore() - ((Student) b).getScore());
            }
        })) {
            System.out.println(student);
        }
    }
}
