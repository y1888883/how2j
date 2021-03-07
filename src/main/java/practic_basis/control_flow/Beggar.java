package practic_basis.control_flow;

import java.util.Scanner;

/**
 * @author: bamboo on 20/12/25
 * @description: _
 * 天朝有一个乞丐姓洪，去天桥要钱
 * 第一天要了1块钱
 * 第二天要了2块钱
 * 第三天要了4块钱
 * 第四天要了8块钱
 * 以此类推
 * 问题： 洪乞丐干10天，收入是多少？
 */

public class Beggar {
    public static void main(String[] args) {
//        Math.pow()实现幂等效果
        int sum = 0;
        int num = 0;
        for (int i = 0; i < 10; i++) {
            num = (int) Math.pow(2, i);
            sum += num;
        }
        System.out.println(sum);
    }

  /*   public static void main(String[] args) {
         int money = 0;
         for(int i = 0;i<10;i++){
             int day = (int) Math.pow(2, i);
             money += day;
         }
         System.out.println(money);
     }*/

}
