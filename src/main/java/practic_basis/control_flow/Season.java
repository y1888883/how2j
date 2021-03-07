package practic_basis.control_flow;

import java.util.Scanner;

/**
 * @author: bamboo on 20/12/24
 * @description: _ 用switch语句通过输入的数字判断是什么季节
 */

public class Season {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = in.nextInt();
        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println("夏天");
                break;

        }
    }
}
