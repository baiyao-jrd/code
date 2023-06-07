package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/23:01
 * @Description:
 */
public class Eaxmple1 {
        public int finalValueAfterOperations(String[] operations) {
            int result = 0;

            for (String operation : operations) {
               result = ("++X".equals(operation) || "X++".equals(operation) ? result + 1 : result - 1);
            }

            return result;
        }
}
