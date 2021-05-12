package core.date;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: bamboo on 21/4/23
 * @description: _
 */

public class CompareDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        SimpleDateFormat year = new SimpleDateFormat("yyyyMMdd");
        try {
            Date start = sdf.parse("120000");
            Date end = sdf.parse("130000");
            String today = year.format(new Date());
            Date todayDate = year.parse(today);
//            开始日期
            Date startDate = year.parse("20210515");
            Date endDate = year.parse("20210510");

/*            String today = sdf.format(new Date());
//            System.out.println(today);
            Date date = sdf.parse(today);
//            System.out.println(date);*/
            System.out.println(start.getTime());
            System.out.println(end.getTime());
            System.out.println(startDate);
            System.out.println(endDate);
            if (!startDate.before(endDate) && !(start.getTime() > end.getTime())) {
                System.out.println("false");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
       /* long time = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(time);
        System.out.println(timestamp);
*/

    }
}
