package practic_basis.control_flow;

import java.util.Scanner;

/**
 * @author: bamboo on 22/5/10
 * @description: _
 * 通过Scanner 获取一个整数，然后使用while计算这个整数的阶乘
 * N的阶乘等于 N* (N-1) * (N-2) * ... * 1
 */

public class Factorial02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int num = sc.nextInt();
        int res = 1;
//        int fac = 1;
//        3  res=3*2
//        for 是从0开始往上加直到大于目标数后就停止
        for (int i = 0; i < num; i++) {
            res = res * num;
//            fac = fac * res;
            num--;
        }
        System.out.println(res);

    }
}
