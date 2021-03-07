package practic_basis.calculate;

/**
 * @author: bamboo on 20/12/21
 * @description: _自增or self_decreasing
 * 技巧：++a是先取值再运算，先对前一个值进行++，在dubeg到他这一步时已经++了，他后面一步不会再进行++了
 *      a++是先运算再取值,就是你前一个值是什么他就输出什么，走到他后面一步才++
 */

public class IncreaseOrDecrease {
    public static void main(String[] args) {
        int a = 4;
        /*int b = 5;
        System.out.println(a++ +" ===a++");
        System.out.println(a+" ===a");
        System.out.println(a+" ===a");
        System.out.println(++a+" ===++a");
        System.out.println(a+" ===a");
        System.out.println(a+" ===a");
        System.out.println(b--+" ===b--");
        System.out.println(b+" ===b");
        System.out.println(b+" ===b");
        System.out.println(--b+" ===--b");
        System.out.println(b+" ===b");
        System.out.println(b+" ===b");*/
        int i = 1;
        int j = ++i + i++ + ++i + ++i + i++;
//        1221
//        13-8=5
//              1+3+3+4+5
//        1222
//        2+2+4+5+5 success
//        System.out.println(j);

/*        int i = 5;
        int j = i++;*/
        System.out.println(j);


    }
}
