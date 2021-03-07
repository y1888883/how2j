package practic_basis.array;

import java.util.Arrays;
import java.util.Random;

/**
 * @author: bamboo on 21/1/22
 * @description: _
 * 将两个数组合并为一个数组
 */

public class MergeArray {
    public static void main(String[] args) {
/*        int a = (int) (Math.random() * 5) + 5;
        System.out.println(a);*/
        int[] arr = new int[(int) (Math.random() * 5) + 5];
        int[] arr2 = new int[(int) (Math.random() * 5) + 5];
        int[] arr1 = merge(arr);
        System.out.println(Arrays.toString(arr1));
        int[] arr3 = merge(arr2);
        System.out.println(Arrays.toString(arr3));
//        怎么来求新的数组的长度呢？
        int[] arr4 = new int[arr1.length + arr3.length];
//        先将1的值给他再将2的值给他
        System.arraycopy(arr1, 0, arr4, 0, arr1.length);
        System.arraycopy(arr3, 0, arr4, arr1.length, arr3.length);
        System.out.println(Arrays.toString(arr4));


    }

    private static int[] merge(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
