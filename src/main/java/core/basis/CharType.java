package core.basis;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author: bamboo on 20/12/7
 * @description: _码点数量（实际长度）codePointCount
 */

public class CharType {
    public static void main(String[] args) {
       /* String greeting = "Hello";


        int count = greeting.codePointCount(0, i);
        System.out.println(count);*/
        int i = 0;
        String str = "inter";
//       这里取得是r对应的ASCII的位置
       /* int cp = str.codePointAt(i);
        if (Character.isSupplementaryCodePoint(cp)) {
            i += 2;
            System.out.println(Character.isSupplementaryCodePoint(cp));
        } else i++;*/
//       str.codePoints是流，得到的是地址，
        int[] intStream = str.codePoints().toArray();
        System.out.println(Arrays.toString(intStream));


    }
}
