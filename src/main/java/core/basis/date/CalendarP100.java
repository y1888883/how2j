package core.basis.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * @author: bamboo on 21/1/16
 * @description: _用localDate来构建一个日历
 */

public class CalendarP100 {
    public static void main(String[] args) {
//        先构造一个日历对象
        LocalDate date = LocalDate.now();
//        获得月日
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
//        System.out.println(month + "--" + date+"--"+dayOfMonth);
//        然后将date设置为这个这个月的第一天
        date = date.minusDays(dayOfMonth - 1);
//        System.out.println(date);
//        并知道这一天是星期几
        int dayOfWeek = date.getDayOfWeek().getValue();
//        System.out.println(dayOfWeek);
        System.out.println("Mon Tue wed Thu Fir Sat Sun");
        for (int i = 0; i < dayOfWeek; i++) {
            System.out.println("   ");
        }
        System.out.println(date.getMonthValue()+"--"+month+"--"+date.getDayOfMonth());
        System.out.printf("%3d",date.getDayOfMonth());

    /*    while (date.getDayOfMonth() == month) {
            System.out.printf("%3d",date.getDayOfMonth());
        }*/


    }


}
