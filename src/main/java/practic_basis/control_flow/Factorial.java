package practic_basis.control_flow;

import java.util.Scanner;

/**
 * @author: bamboo on 20/12/24
 * @description: _
 * 通过Scanner 获取一个整数，然后使用while计算这个整数的阶乘
 * N的阶乘等于 N* (N-1) * (N-2) * ... * 1
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 1;
        while (num >= 1) {
            a *= num;
            num--;
        }
        System.out.println(a);
    }
}
