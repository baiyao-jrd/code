package day31.iostream.caseDemo2;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/22/12:07
 * @Description:
 */
public class SaveAndReload {
    public static void main(String[] args) throws IOException {
        save();
        reload();
    }

    private static void reload() throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("java/day31/iostream/resources/game.dat"));

        try {
            String name = in.readUTF();
            int age = in.readInt();
            char gender = in.readChar();
            long energy = in.readLong();
            double price = in.readDouble();
            boolean relive = in.readBoolean();

            System.out.println("" +
                    "name : " + name + "\t" +
                    "age : " + age + "\t" +
                    "gender : " + gender + "\t" +
                    "energy : " + energy + "\t" +
                    "price : " + price + "\t" +
                    "relive : " + relive + "\t" +
                    "");
        } finally {
            in.close();
        }
    }

    private static void save() throws IOException {
        String name = "巫师";
        int age = 30;
        char gender = '男';
        long energy = 5000;
        double price = 99.9;
        boolean relive = true;

        DataOutputStream out = new DataOutputStream(new FileOutputStream("java/day31/iostream/resources/game.dat"));
        out.writeUTF(name);
        out.writeInt(age);
        out.writeChar(gender);
        out.writeLong(energy);
        out.writeDouble(price);
        out.writeBoolean(relive);

        out.close();
    }
}
