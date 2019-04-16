package basecode._09日期练习;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
    需求：计算出生到现在活了多少天

    分析:
         1. 生日日期字符串："1999-02-10"
         2. 将生日字符串转换为日期对象：String --> Date
         3. 获得出生时的毫秒值：long
         4. 获得当前时间的毫秒值：long
         5. 两个毫秒值相减：long
         6. 计算天数
 */
public class Demo09 {

    public static void main(String[] args) throws ParseException {

        //1. 生日日期字符串："1999-02-10"
        String birthdayStr = "1999-02-10";

        //2. 将生日字符串转换为日期对象：String --> Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayStr);
        //System.out.println(date);

        //3. 获得出生时的毫秒值：long
        long birthdayDateTime = birthdayDate.getTime();

        //4. 获得当前时间的毫秒值：long
        Date currentDate = new Date();
        long currentDateTime = currentDate.getTime();

        //5. 两个毫秒值相减：long
        long distance = currentDateTime - birthdayDateTime;

        //6. 计算天数
        System.out.println("活了"+(distance/1000/3600/24)+"天");

    }

}
