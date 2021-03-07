package practic_basis.array;

/**
 * @author: bamboo on 21/1/8
 * @description: _
 * 首先创建一个长度是5的数组
 * 然后给数组的每一位赋予随机整数
 * 通过for循环，遍历数组，找出最小的一个值出来
 * 0-100的 随机整数的获取办法有多种，下面是参考办法之一:
 * (int) (Math.random() * 100)
 * 这个未完成
 */

public class Minimum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.random() * 100;
            for (int j = 0; j < 100; j++) {
//                找出一个最小值

            }
        }

    }
}
