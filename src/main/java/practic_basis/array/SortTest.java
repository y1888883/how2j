package practic_basis.array;

import java.util.Arrays;

/**
 * @author: bamboo on 21/1/18
 * @description: _
 * 选择法排序的思路：
 * 把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来
 * 比较完后，第一位就是最小的
 * 然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来
 * 比较完后，第二位就是第二小的
 */

public class SortTest {
    //    先给一个5位的数组，随机给
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
//        排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
//                给一个中间变量
                if (arr[j] < arr[i]) {
//                    将小值赋给中间变量
                    int temp = arr[j];
//                    将在前面的大值赋值给第二位
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr) + "--这是排序后的");

    }
}
