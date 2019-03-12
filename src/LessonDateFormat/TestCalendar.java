package LessonDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
Calendar类和Date类相互转换
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar=new GregorianCalendar();
        int year=calendar.get(Calendar.YEAR);
        int month=Calendar.MONTH;
        int day=Calendar.DAY_OF_YEAR;
        System.out.println(year+" "+month+" "+day);

        Calendar c2=new GregorianCalendar();
        c2.set(Calendar.YEAR,8012);
        System.out.println(c2);

        Calendar c3=new GregorianCalendar();
        c3.add(Calendar.YEAR, -1000);
        System.out.println(c3.get(Calendar.YEAR));

        Date d=c3.getTime();
        System.out.println(d);
        Calendar c4=new GregorianCalendar();
        c4.setTime(new Date());
        System.out.println(c4);

        printCal(c4);
    }
    public static void printCal(Calendar c){
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int date=c.get(Calendar.DAY_OF_MONTH);
        int weekday=c.get(Calendar.DAY_OF_WEEK);

        String weekday1="";
        switch (weekday){
            case 1:
                weekday1="星期日";
                break;
            case 2:
                weekday1="星期一";
                break;
            case 3:
                weekday1="星期二";
                break;
            case 4:
                weekday1="星期三";
                break;
            case 5:
                weekday1="星期四";
                break;
            case 6:
                weekday1="星期五";
                break;
            case 7:
                weekday1="星期六";
                break;
        }
        int hour=c.get(Calendar.HOUR);
        int minute=c.get(Calendar.MINUTE);
        int second=c.get(Calendar.SECOND);

        System.out.println(year+"年"+month+"月"+date+"日 "+weekday1+" "+hour+"时"+minute+"分"
        +second+"秒");
    }
}
