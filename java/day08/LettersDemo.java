package day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/13/18:02
 * @Description: 用char数组存26个小写英文字母 -> 遍历数组的时候，大写输出
 */
public class LettersDemo {
    public static void main(String[] args) {
        char[] charArr = new char[26];

        //1. 存储
        char letter = 'a';
        for (int i = 0; i < charArr.length; i++, letter++) {
            charArr[i] = letter;
            System.out.print(charArr[i] + " ");
        }

        System.out.println();

        //2. 遍历
        for (char c : charArr) {
            System.out.print((char)(c - 32) + " ");
        }

        //3. 疑问
        System.out.println(charArr[0] - 32);
        System.out.println((char)(charArr[0] - 32));
    }
}