package day14;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/20/16:07
 * @Description: 银行账户信息展示类
 */
public class BankAccountDisplayInfo {
    public static void main(String[] args) {
        BankAccount zhangSan = new BankAccount();
        zhangSan.accountNum = "621 799 298 001 6758 075";
        zhangSan.name = "张三";
        zhangSan.id = "410323199609235511";
        zhangSan.phoneNum = 1830362036l;
        zhangSan.balance = 98000l;

        BankAccount liSi = new BankAccount();
        liSi.accountNum = "621 799 498 001 6758 075";
        liSi.name = "李四";
        liSi.id = "410323199609235512";
        liSi.phoneNum = 183036020307l;
        liSi.balance = 18998l;
        liSi.interestRate = 0.036;

        info(zhangSan, "zhangSan");
        info(liSi, "liSi");
    }

    private static void info(BankAccount name, String nameStr) {
        System.out.println(nameStr + "的个人信息如下：");
        System.out.println("账号：" + name.accountNum + ", 户名：" + name.name + ", 身份证号：" + name.id);
        System.out.println("手机号：" + name.phoneNum + ", 余额：" + name.balance + ", 利率：" + name.interestRate);
        System.out.println();
    }
}
