package practic_basis.calculate;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author: bamboo on 22/5/4
 * @description: _通过[Scanner]输入一个**1-7**之间的整数，使用三元操作符判断是工作日还是周末？
 */

public class TernaryAgain {
    public static void main(String[] args) throws IOException {
       /* new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        System.out.println(System.in.read());*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7的整数");
        int next = sc.nextInt();
        if (next > 0 && next <= 7) {
            System.out.println(next<5?"workday":"dayOff");
        }else{
            System.out.println("输入日期不合法");
        }


    }
}
