package javaTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    }
}
