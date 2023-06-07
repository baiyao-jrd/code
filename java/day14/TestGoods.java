package day14;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/20/15:51
 * @Description: 商品信息展示
 */
public class TestGoods {
    public static void main(String[] args) {
        Goods xiYou = new Goods(){};
        xiYou.number = 10110;
        xiYou.name = "西游";
        xiYou.price = 99L;
        xiYou.store = 10;

        Goods hongLou = new Goods();
        hongLou.number = 11111;
        hongLou.name = "红楼";
        hongLou.price = 100l;
        hongLou.store = 6;

        System.out.println("商品编号\t商品名称\t商品价格\t商品库存");
        System.out.println(xiYou.number + "\t" + xiYou.name + "\t\t" + xiYou.price + "\t\t" + xiYou.store);
        System.out.println(hongLou.number + "\t" + hongLou.name + "\t\t" + hongLou.price + "\t\t" + hongLou.store);
    }
}
