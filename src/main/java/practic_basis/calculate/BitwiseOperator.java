package practic_basis.calculate;

/**
 * @author: bamboo on 22/5/4
 * @description: _按位运算符，是根据二进制的位数来进行比较的
 * 01<<2>>>1,100,  010
 */

public class BitwiseOperator {
    public static void main(String[] args) {
        int i = 3; // 二进制是11
        int j = 2; // 二进制是10
        int c = ((i | j) ^ (i & j)) << 2 >>> 1;
        System.out.println(c);
    }

}
