package practic_basis.array;

/**
 * @author: bamboo on 21/5/6
 * @description: _这道题的意思是让你不用乘法直接用位移去计算
 * 这个是左移和右移是根据整数的二进制所表达的，求出整数的二进制，
 * 然后左移补0，右移减0这样计算
 */

public class LeftAndRightShift {
    public static void main(String[] args) {
        byte num = 2;
//        首先2的二进制是0010，然后往左移4位就是0010 0000=32，然后是从右往左的去计算，
        System.out.println(num << 4);
    }
}
