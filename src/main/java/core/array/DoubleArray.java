package core.array;

import java.util.Arrays;

/**
 * @author: bamboo on 21/1/27
 * @description: _ 二维数组
 */

public class DoubleArray {
    public static void main(String[] args) {
//        有两个一位数组，每一个数组的长度是4
        int[][] arr = new int[2][4];
//        这里的赋值是赋的是y的值
        arr[0][0] = 1;
        arr[1][2] = 5;
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
   /*     int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 100);



            }
        }*/
    }

}
