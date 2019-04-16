package homework.Test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
    需求：
        把你的生日字符串(如格式:1992-10-20)转换成对应的日期对象
 */
public class Test04 {

    public static void main(String[] args) throws ParseException {

        //1.创建字符串
        String dateStr = "1992-10-20";

        //2.创建对应方法类时间对象
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

        //3.转换成日期对象
        Date date = sf.parse(dateStr);

        //4.输出日期对象
        System.out.println(date);

    }

}
