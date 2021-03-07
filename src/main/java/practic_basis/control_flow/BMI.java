package practic_basis.control_flow;

import java.util.Scanner;

/**
 * @author: bamboo on 20/12/23
 * @description: _
 */

public class BMI {
    public static void main(String[] args) {
        System.out.println("请输入身高");
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        System.out.println("请输入体重");
        int weight = in.nextInt();
        int judge = weight / (height * height);
//        用switch不行，只能用if else else if
/*        switch (judge) {
            case judge < 18.5:

        }*/
    }
}
