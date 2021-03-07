package practic_basis.calculate;

import java.util.Scanner;

/**
 * @author: bamboo on 20/12/22
 * @description: _BMI的计算公式是 体重(kg) / (身高*身高)
 */

public class BIM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("身高？");
        double height = in.nextDouble();
        System.out.println("体重？");
        int weight = in.nextInt();
        double bim = weight / (height * height);
        System.out.println(bim);
    }
}
