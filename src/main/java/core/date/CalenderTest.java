package core.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: bamboo on 21/4/15
 * @description: _
 */

public class CalenderTest {
    public static void main(String[] args) throws ParseException {
        String execDt = "2021-04-15";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date format = sdf.parse(execDt);
        System.out.println(format);
        try {
//            String format = dateFormat.format(execDt);
            Date date = sdf.parse(execDt);
            Calendar time = Calendar.getInstance();
            time.setTime(date);
            int day = time.get(Calendar.DAY_OF_MONTH);
            int maxDay = time.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println(day + "---" + maxDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
