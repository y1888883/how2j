package practic_basis.variable_03;

/**
 * @author: bamboo on 21/12/11
 * @description: _
 */

public class TypeCast {
    public static void main(String[] args) {
        long l = 50;

//        低精度转为高精度必须要强制转换
//        i = l;
       int i = (int) l;
//        高精度像低精度转换没有问题
        l = i;
        byte b = 127;
        int i1 = 10;
//        b = i1;
//        String c = "c";
        char c = 'A';
        System.out.println(Integer.valueOf(c));
    }
}
