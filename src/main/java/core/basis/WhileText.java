package core.basis;

import java.util.Scanner;

/**
 * @author: bamboo on 20/12/13
 * @description: _ 当你每年存入一定的养老金，每年存入的数量是固定的，你要花多久才能存够，
 */

public class WhileText {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you need retire");
        double goal = in.nextDouble();
        System.out.println("How much money will you contribute evey year");
        double payment = in.nextDouble();
        System.out.println("interest rate in %: ");
        double interestRate = in.nextDouble();
//        这里关于计算利息是
//        本金=本金+本金*利率
//        和goal相等的钱，初始化是0，year=0
        double balance = 0;
        int year = 0;
        while (balance < goal) {
//            为什么要这样写本金？因为这个balance还要加利息，这里的payment始终是5万
          /*  balance += payment;
//           利息=本金*利率
            double interest = balance * (interestRate / 100);
//            最终的本金
            balance += interest;*///balance += payment+(balance*0.034)
//            这种算法就是我存了5万，利息不变，存多少钱才能到一百万，题目要求是每年都要存5万
//            这样算是错误的
//            balance +=  balance * interestRate;//balance = 2*balance+(balance*0.034)，
            balance = balance + payment + (balance + payment) * (interestRate / 100);
//            x=x+y+(x+y)*3.4=3.4x+3.4y+x+y=4.4x+4.4y=(1+3.4)*(x+y),2+2*3.4=(1+3.4)*2
            year++;
        }
        System.out.println("you can retire "+year+" year");
    }
}
