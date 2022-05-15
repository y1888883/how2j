package treeWallet;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: bamboo on 21/5/13
 * @description: _
 */

public class TimeTest {
    public static void main(String[] args) {
        String start = "120000";
        long time = System.currentTimeMillis();
        java.sql.Timestamp tms = new java.sql.Timestamp(time);
        System.out.println(tms);
        List<String> str =new ArrayList<String>() ;
        str.add("1");
        str.add("2");
        str.add("3");
    }
}
