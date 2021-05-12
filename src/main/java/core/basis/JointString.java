package core.basis;

/**
 * @author: bamboo on 20/12/6
 * @description: _用join做一个定界符分隔
 */

public class JointString {
    public static void main(String[] args) {
//        如果要把多个字符串放在一起用分隔符分隔可以使用join
       /* String str = String.join("/", "S", "M", "L");
        System.out.println(str);*/
//        子串
        String greeting = "Hello";
        greeting = greeting.substring(0, 3) + "p!";
        System.out.println(greeting);
    }

}
