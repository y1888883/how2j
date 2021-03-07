package practic_basis.control_flow;

/**
 * @author: bamboo on 20/12/25
 * @description: _
 * 打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
 */

public class Module {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
