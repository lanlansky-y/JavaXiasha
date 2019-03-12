package LessonDateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;
/*
可视化日历程序
 */

public class TestCalendar2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入您想要查询的时间(例如：2019年3月6日):");
        Scanner sc=new Scanner(System.in);
        String dateStr=sc.next();
        System.out.println("您刚刚输入的日期是"+dateStr);

        //将输入的字符串转为Date类
        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日");
        Date d=df.parse(dateStr);
        //将Date类转换为Calendar类
        Calendar c=new GregorianCalendar();
        c.setTime(d);

        //保存一下当天的日期
        int currentday=c.get(Calendar.DATE);

        //设置日期为当月的一号
        c.set(Calendar.DATE,1);

        System.out.println("日\t一\t二\t三\t四\t五\t六");

        //当月一号前星期天数清零
        for(int i=1;i<c.get(Calendar.DAY_OF_WEEK);i++){
            System.out.print("\t");
        }
        //保存当月总天数
        int days=c.getActualMaximum(Calendar.DATE);
        //输出日历
        for(int i=1;i<=days;i++){
            if(currentday==c.get(Calendar.DATE)){
                System.out.print(c.get(Calendar.DATE)+"*\t");
            }else{

                System.out.print(c.get(Calendar.DATE)+"\t");
            }
            if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                System.out.println();
            }

            c.add(Calendar.DATE,1);
        }

    }
}
