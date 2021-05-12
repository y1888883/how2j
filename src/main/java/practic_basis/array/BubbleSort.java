package practic_basis.array;

import java.util.Arrays;

/**
 * @author: bamboo on 21/1/18
 * @description: _
 * 冒泡法排序的思路：
 * 第一步：从第一位开始，把相邻两位进行比较
 * 如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
 * 第二步： 再来一次，只不过不用比较最后一位
 * 以此类推
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));

//    一共5个数据前后两个进行比较，第一轮需要比较4次(1,4  )，(2,3)(3,2)(4,1)
//    先轮再次,一共比较4轮
        for (int i = 0; i < arr.length - 1; i++) {
//    再次，轮数越小，比较的次数越多，第一轮需要比较4次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    大值
                    int temp = arr[j];
//                    将小值赋给大值
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
