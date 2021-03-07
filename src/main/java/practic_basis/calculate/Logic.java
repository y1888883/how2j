package practic_basis.calculate;

/**
 * @author: bamboo on 20/12/22
 * @description: _
 */

public class Logic {
    public static void main(String[] args) {
        int i = 1;
       /* boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
        System.out.println(b);
        System.out.println(i);*/
        boolean b = !(i++ == 3); //^ (i++ == 2) && (i++ == 3);
        boolean a = (i++ == 2);
        boolean c = (i++ == 3);
        boolean d = b ^ a && c;
        System.out.println(d);
        System.out.println(i);


    }
}
