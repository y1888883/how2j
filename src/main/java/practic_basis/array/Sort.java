package practic_basis.array;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author: bamboo on 21/1/13
 * @description: _
 * 选择法排序的思路：
 * 把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来
 * 比较完后，第一位就是最小的
 * 然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来
 * 比较完后，第二位就是第二小的
 */

public class Sort {
    public static void main(String[] args) {
//        先随机数分配5个，然后遍历数组，遍历后再反转
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
//        System.out.println(Arrays.toString(arr));
/*        int[] arr1 = reverse(arr);
        System.out.println(Arrays.toString(arr1) + "---arr1");*/
//        Collections.sort(arr);
//        循环打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
//                中间变量，他的意思是第二个值比第一个值小就把第二值往前送
                if (arr[j] < arr[i]) {
//                    将小值付给中间变量
                    int temp = arr[j];
//                    将大值赋给小值
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("---------我要开始排序了----------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        冒泡法倒序


    }


    private static int[] reverse(int[] arr) {
        for (int startIndex = 0, endIndex = arr.length - 1; startIndex <= endIndex; startIndex++, endIndex--) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
        return arr;
    }
}
