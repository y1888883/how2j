package practic_basis.control_flow;

/**
 * @author: bamboo on 20/12/26
 * @description: _
 * 假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。
 * 然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。
 * 那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
 * （复利计算按照每年12000投入计算，不按照每月计息）
 * 复利公式：
 * F = p* ( (1+r)^n );
 * F 最终收入
 * p 本金
 * r 年利率
 * n 存了多少年
 */

public class Millionaire {
    public static void main(String[] args) {
//      一年的最终收入  F = 12000*((1.2)^1)
        double goal = 1000000;
        double sum = 0;
        int year = 1;
        int payment = 12000;
        while (sum <= goal) {
//            这个payment是每年要存的钱
            sum += payment * (Math.pow(1.2, year));
            year++;
        }
        System.out.println(year);
    }
}
