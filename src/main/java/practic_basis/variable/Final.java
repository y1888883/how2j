package practic_basis.variable;

/**
 * @author: bamboo on 20/12/21
 * @description: _ 如果final修饰的是参数？能否成功
 */

public class Final {
    public static void main(String[] args) {
        int i = 0;
        i += method1(6);
    }


    public static int method1(final int j) {
        return j;
    }
}
