package core.basis;

import java.io.PrintStream;

/**
 * @author: bamboo on 20/12/11
 * @description: _关于格式化数值
 */

public class PrintfTest {
    public static void main(String[] args) {
        double d = 1000 / 3.0;
        System.out.printf("%8.2f", d);
        String name = "张三";
        int age = 12;
        System.out.printf("Hello,%s.Next year,you'll be %d",name,age);
    }
}
