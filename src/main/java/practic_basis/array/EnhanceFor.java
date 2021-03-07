package practic_basis.array;

import java.util.Arrays;

/**
 * @author: bamboo on 21/1/20
 * @description: _
 * 用增强for循环来找出最大值
 */

public class EnhanceFor {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
//        用增强for找出最大值
//        找出最大值需要哪些条件，首先数组一个个去进行比较，
//        增强for的i是值不是索引
//        for (int i : arr) {
//        这样写就是假如[12,34,4,78,45]这样5个数。他是这样比的，12和34比，34大就输出34，34和4比，34大，就输出34
       /* for (int i = 0; i < arr.length; i++) {
            if (i<=(arr.length-1)) {
                System.out.println(arr[i] > arr[i + 1] ? arr[i] : arr[i + 1]);
            }
        }*/
//       每一个数字和其它每一个数字进行比较
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
//        }
        System.out.println(max);

    }
}

