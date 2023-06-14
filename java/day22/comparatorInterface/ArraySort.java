package day22.comparatorInterface;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/12/19:32
 * @Description:
 */
public class ArraySort {

    public static Student[] returnFlag(Student[] stuArr, Comparator com) {
        for (int i = 0; i < stuArr.length - 1; i++) {
            for (int j = i + 1; j < stuArr.length; j++) {
                if (com.sort(stuArr[i], stuArr[j]) > 0) {
                    Student stu = stuArr[i];
                    stuArr[i] = stuArr[j];
                    stuArr[j] = stu;
                }
            }
        }

        return stuArr;
    }
}
