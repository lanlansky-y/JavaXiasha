package LessonDateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 将时间对象和字符串相互转换
 */
public class TestDateFormat  {

    public static void main(String[] args) throws ParseException {

        //将时间对象通过“格式字符串指定的格式”转化为相应的字符串
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str=df.format(new Date(10000000000000L));
        System.out.println(str);

        //将字符串通过“格式字符串指定的格式”转换为时间对象
        DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date d=df2.parse("2019年3月4日 20时47分40秒");
        System.out.println(d);
        //获得时间戳
        System.out.println(d.getTime());

        DateFormat df3=new SimpleDateFormat("W");
        String str1=df3.format(new Date());
        System.out.println(str1);//输出本周是当月的第几周





    }
}
