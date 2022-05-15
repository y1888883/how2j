package practic_basis.calculate;

/**
 * @author: bamboo on 22/5/1
 * @description: _只要记住，i++是先赋值为0，执行完毕后i才进行++的操作，a=i++,a=i,i=i+1
 * 而++i,a=++i,i=i+1,a=i
 */

public class AddTest {
    public static void main(String[] args) {
/*        int i = 1;
*//*        int a = i++;
        int j = i++;*//*
        System.out.println(i++ + i++ + i++);
        System.out.println(i);*/
        int i = 1;
        boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
        System.out.println(b);
        System.out.println(i);

    }
}
