package day31.iostream.caseDemo3;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/14:44
 * @Description:
 */
public class InvalidClassExceptionExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));

        Person p = new Person("江润冬", 26);

        out.writeObject(p);
        out.close();

        Person.setSerialVersionUID(2L);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
        System.out.println(in.readObject());

        in.close();
    }
}

class Person implements Serializable {
    private static long serialVersionUID = 1L;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        Person.serialVersionUID = serialVersionUID;
    }
}
