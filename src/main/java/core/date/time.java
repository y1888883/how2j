package core.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: bamboo on 21/4/25
 * @description: _
 */

public class time {
    public static void main(String[] args) {
        String one = "232405";
        String tow = "112507";
        String start = "20210405";
        String end = "20201009";
        String timeFormat = "hh:mm:ss";
        String dateFormat = "yyyy-mm-dd";
        long time = System.currentTimeMillis();

        comepare(start, end, dateFormat);

        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        try {
            String s = sdf.format(new Date());
            System.out.println(s+"-----");
            Date oneDate = sdf.parse(one);
            Date towDate = sdf.parse(tow);
            long time1 = oneDate.getTime();
            long time2 = towDate.getTime();
            System.out.println(time1+"---"+time2);
            System.out.println(oneDate.getTime());
            System.out.println(oneDate.toString());
            if (time1<time2) {
                System.out.println(oneDate+"---"+towDate);
                System.out.println(false);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static void comepare(String start, String end, String dateFormat) {

    }
}
