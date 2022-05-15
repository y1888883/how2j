package practic_basis.control_flow;

import java.util.Scanner;

/**
 * @author: bamboo on 20/12/23
 * @description: _最重要的是这个范围，
 * 基于前面的操作符练习-BMI，做基于判断的改进：
 * 使用Scanner收集你的身高体重，并计算出你的BMI值是多少
 * BMI的计算公式是 体重(kg) / (身高*身高)
 * 比如邱阳波的体重是72kg, 身高是1.69，那么这位同学的BMI就是
 * 72 / (1.69*1.69) = ?
 * 然后通过条件判断BMI的范围，打印出是超重还是正常
 */

public class BMISwitch {
    public static void main(String[] args) {
        System.out.println("请输入身高");
        Scanner in = new Scanner(System.in);
        double height = in.nextDouble();
        System.out.println("请输入体重");
        double weight = in.nextDouble();
        double judge = weight / (height * height);
//        用switch不行，只能用if else else if
        long s = System.currentTimeMillis();
        int result = ((judge < 18.5) ? 1 : 0) + ((judge < 24) ? 1 : 0) + ((judge < 27) ? 1 : 0) + ((judge < 30) ? 1 : 0) + ((judge < 35) ? 1 : 0);
        switch (result) {
            case 0:
                System.out.println(judge + "--重度肥胖");
                break;
            case 1:
                System.out.println(judge + "--中度肥胖");
                break;
            case 2:
                System.out.println(judge + "--轻度度肥胖");
                break;
            case 3:
                System.out.println(judge + "--体重过重");
                break;
            case 4:
                System.out.println(judge + "--正常范围");
                break;
            case 5:
                System.out.println(judge + "--体重过轻");
                break;
        }
        long e = System.currentTimeMillis();
        long r = e - s;
        System.out.println(r);

    }
}
