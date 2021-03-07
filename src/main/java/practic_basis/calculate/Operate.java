package practic_basis.calculate;

import java.util.Scanner;

/**
 * @author: bamboo on 20/12/22
 * @description: _
 * 借助Scanner获取控制台输入的两个任意数字，然后使用
 * > 大于
 * >= 大于或等于
 * < 小于
 * <= 小于或等于
 * == 是否相等
 * != 是否不等
 * 判断两个值之间的关系
 */

public class Operate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a number");
        int a = in.nextInt();
        System.out.println("input another number");
        int b = in.nextInt();
        System.out.println(a+">"+b+": "+(a>b));
    }
}
