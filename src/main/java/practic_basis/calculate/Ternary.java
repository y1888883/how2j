package practic_basis.calculate;

import java.util.Scanner;

/**
 * @author: bamboo on 20/12/23
 * @description: _ 用三元运算判断今天是否是周末
 */

public class Ternary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入1-7的数");
        int i = in.nextInt();
        if (i >= 1 && i <= 7) {
            String j = i > 5 ? "weekend" : "workday";
            System.out.println(j);
        } else {
            System.out.println("您的输入不合法请重新输入");
        }

    }
}
