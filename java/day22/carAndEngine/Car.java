package day22.carAndEngine;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/12/16:45
 * @Description:
 */
public class Car {
    private final double oilVolume;

    private final Engine engine;

    public Car(double oilVolume) {
        this.oilVolume = oilVolume;
        engine = new Engine();
    }

    private class Engine {
        private boolean flag;

        void on() {
            if (oilVolume <= 0) {
                System.out.println("油量不足, 无法启动");
            } else {
                System.out.println("发动机 -> 发动");
                flag = true;
            }
        }

        void off() {
            if (oilVolume <= 0) {
                System.out.println("油量不足, 发动机未启动");
            } else {
                System.out.println("发动机 -> 熄火");
                flag = false;
            }
        }

        void work() {
            if (oilVolume <= 0) {
                return;
            }
            System.out.println("发动机 -> 工作");
        }
    }

    public void start() {
        System.out.println("汽车 -> 启动");
        engine.on();
    }

    public void stop() {
        System.out.println("汽车 -> 停止");
        engine.off();
    }

    public void drive() {
        if (oilVolume > 0 && engine.flag) {
            engine.work();
            System.out.println("汽车 -> 行驶");
        } else {
            System.out.println(oilVolume <= 0 ? "油量不足, 无法行驶" : "发动机未启动, 无法行驶");
        }
    }
}
