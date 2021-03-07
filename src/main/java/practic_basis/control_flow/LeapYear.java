package practic_basis.control_flow;

import java.util.Scanner;

/**
 * @author: bamboo on 20/12/24
 * @description: _
 * 判断某一年是否为闰年
 * 通过Scanner 输入一个年份，然后判断该年是否是闰年
 * 闰年判断标准(满足任何一个)
 * 1. 如果能够被4整除，但是不能被100整除
 * 2. 能够被400整除
 */

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if ((year % 4) == 0 && (year % 100) != 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
