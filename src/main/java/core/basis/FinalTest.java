package core.basis;

import org.junit.Test;

/**
 * @author: bamboo on 21/1/20
 * @description: _
 * 验证一下在可变的类前面加final是什么效果
 */

public class FinalTest {
    private final StringBuilder evaluation = new StringBuilder();
//    evaluation= new StringBuilder();

    public StringBuilder getBuilder() {
      StringBuilder build=  evaluation.append(1);
//        evaluation = new StringBuilder();
        return build;
    }

    public static void main(String[] args) {
        FinalTest test = new FinalTest();
        System.out.println(test.getBuilder());
    }


}
