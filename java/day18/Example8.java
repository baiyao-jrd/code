package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/15:48
 * @Description:
 */
public class Example8 {
    public static int minMovesToSeat(int[] seats, int[] students) {
        int flag = 0;

        for (int i = 0; i < seats.length - 1; i++) {
            for (int j = i + 1; j < seats.length; j++) {
                if (seats[i] > seats[j]) {
                    int temp = seats[j];
                    seats[j] = seats[i];
                    seats[i] = temp;
                }

                if (students[i] > students[j]) {
                    int temp = students[j];
                    students[j] = students[i];
                    students[i] = temp;
                }
            }
        }

        for (int i = 0; i < seats.length; i++) {
            flag += Math.abs(seats[i] - students[i]);
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4}));
        System.out.println(minMovesToSeat(new int[]{4, 1, 5, 9}, new int[]{1, 3, 2, 6}));
        System.out.println(minMovesToSeat(new int[]{2, 2, 6, 6}, new int[]{1, 3, 2, 6}));
    }
}
