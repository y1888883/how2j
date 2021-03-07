package core.basis.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: bamboo on 20/12/16
 * @description: _ 有50个数字从中抽取6个，且不重复
 */

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many number do you need draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw");
        int n = in.nextInt();
        int[] number = new int[n];
//        把最大数放进int中去初始化,fill an array with numbers 1,2,3,4
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
//        第二个数组用于抽数
        int[] drawNumber = new int[k];
        for (int i = 0; i < drawNumber.length; i++) {
//            make a random index between 0 and n-1
//            这是在n的范围内随机抽取的数的索引，这里用索引可以去number中
            int r = (int) (Math.random() * n);
/*//            把这个随机抽的数放进这个数组中，作为抽到数的集合
            drawNumber[i] = r;*/
//给第二个数组赋值随机数,
// 最大数4，抽3个，随机抽到的第1位索引是0，所以draw第一位是1，然后把最后一位赋值到0索引的位置，所以0索引变成了4，{4，2，3，4}
            drawNumber[i] = number[r];
//            n=3,3-1=2,不管n是几，数组的索引就是从0开始的
             number[r] = number[n - 1];
            n--;
        }
        Arrays.sort(drawNumber);
        for (int i : drawNumber) {
            System.out.println(i);
        }
    }
}
