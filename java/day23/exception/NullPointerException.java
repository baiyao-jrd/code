package day23.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/21:55
 * @Description:
 */
public class NullPointerException {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        // Exception in thread "main" java.lang.NullPointerException
        System.out.println(programmer.getComputer().getBrand());

        Programmer[] programmers = new Programmer[2];

        // Exception in thread "main" java.lang.NullPointerException
        System.out.println(programmers[0].getComputer());
    }
}

class Programmer {
    private String name;
    private Computer computer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}

class Computer {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}