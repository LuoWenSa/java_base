package javaTest;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: Ray
 * @date: 2023年08月22日 16:51
 */
public class DateTest {
    public static void main(String[] args) {
        //获取日期时间
        Date d = new Date();
        //System.out.println("d.getTime() = " + d);
        Date dd = new Date(1692694208979L);
        //System.out.println("dd.getTime() = " + dd);

        //日期比较大小
//        System.out.println("dd.before(d) = " + dd.before(d));
//        System.out.println("dd.after(d) = " + dd.after(d));
//        System.out.println("dd.equals(d) = " + dd.equals(d));
//        System.out.println("dd.compareTo(d) = " + dd.compareTo(d));

        //使用 SimpleDateFormat 格式化日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //1.date --> String
        System.out.println("simpleDateFormat.format(d) = " + simpleDateFormat.format(d));
        try {
            //1.String --> date
            System.out.println("simpleDateFormat.parse() = " + simpleDateFormat.parse("2023-0513 09:53:23"));
        } catch (ParseException e) {
            System.out.println("抛出异常后。。。");
            throw new RuntimeException(e);
        }

        //Java 休眠(sleep)
//        try {
//            Thread.sleep(1000*3);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //Calendar类
        Calendar c = Calendar.getInstance();
        c.set(2023, Calendar.MARCH,13);
        //set
        c.set(Calendar.MONTH, Calendar.MAY);
        System.out.println("c.getTime() = " + new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()));
        //Add设置
        c.add(Calendar.DATE, 20);
        System.out.println("c.getTime() = " + new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()));

        System.out.println("c.get(Calendar.YEAR) = " + c.get(Calendar.YEAR));
        System.out.println("c.get(Calendar.MONTH) = " + c.get(Calendar.MONTH) + 1);
        System.out.println("c.get(Calendar.DATE) = " + c.get(Calendar.DATE));
        System.out.println("c.get(Calendar.HOUR_OF_DAY) = " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("c.get(Calendar.MINUTE) = " + c.get(Calendar.MINUTE));
        System.out.println("c.get(Calendar.SECOND) = " + c.get(Calendar.SECOND));
        System.out.println("c.get(Calendar.DAY_OF_WEEK) = " + c.get(Calendar.DAY_OF_WEEK)); //1-7 --> 星期日-星期六
    }
}
