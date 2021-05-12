package treeWallet;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: bamboo on 21/4/30
 * @description: _
 */

public class CreatTaskId {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String currentDate = sdf.format(date);
//        System.out.println(currentDate);
        Integer maxSn = 12;
        String maxSnStr = maxSn.toString();
        System.out.println(maxSnStr.length());
        String sub = "0";
        Integer sub1 = 00000000;
        Integer index = sub1 + maxSn;
        System.out.println(index);
        String num = index.toString() + currentDate;
        System.out.println(num);

        for (int i = 1; i < 8 - maxSnStr.length(); i++) {
            sub += 0;
        }
        System.out.println(currentDate+sub+maxSnStr);
    }
}
