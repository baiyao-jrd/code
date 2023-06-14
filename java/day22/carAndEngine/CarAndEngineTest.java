package day22.carAndEngine;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/12/16:44
 * @Description:
 */
public class CarAndEngineTest {
    public static void main(String[] args) {
        Car car1 = new Car(2);
        car1.start();
        car1.stop();
        car1.drive();
        car1.start();
        car1.drive();

        Car car = new Car(-2);
        car.start();
        car.stop();
        car.start();
        car.drive();
    }
}
