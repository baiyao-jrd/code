package day28.map;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/19/14:24
 * @Description:
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = System.getProperties();

        String property = properties.getProperty("file.encoding");

        System.out.println(property);
    }
}
