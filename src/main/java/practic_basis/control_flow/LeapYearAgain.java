package practic_basis.control_flow;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;

/**
 * @author: bamboo on 22/5/8
 * @description: _闰年判断标准(满足任何一个)
 * 1. 如果能够被4整除，但是不能被100整除
 * 2. 能够被400整除
 */

public class LeapYearAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)) {
            System.out.println(year + " is Leap Year");
        } else {
            System.out.println(year + " is Common Year");
        }
    }
}
