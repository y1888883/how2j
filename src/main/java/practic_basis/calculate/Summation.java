package practic_basis.calculate;

import java.util.Scanner;

/**
 * @author: bamboo on 20/12/21
 * @description: _
 * 使用Scanner从控制台获取两个数字，然后计算这两个数字的和
 */

public class Summation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = in.nextInt();
        System.out.println("Enter another number");
        int j = in.nextInt();
        System.out.println(i + j);
    }
}
