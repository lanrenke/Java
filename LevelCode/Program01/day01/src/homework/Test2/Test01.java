package homework.Test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
    需求:
        请使用代码实现计算你活了多少天
 */
public class Test01 {

    public static void main(String[] args) throws ParseException {

        //1.创建字符串
        String dateStr = "1991-3-30";

        //2.创建日期对象
        Date date = new Date();

        //3.获取当前毫秒值
        long nowTime = date.getTime();

        //4.创建方法类对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //5.将字符串转换成日期对象
        Date brithdate = sdf.parse(dateStr);

        //6.获取出生日期毫秒值
        long brithTime = brithdate.getTime();

        //7.输出
        System.out.println("活了"+(nowTime - brithTime)/1000/3600/24+"天");


        //标准答案
        // a)把你生日的字符串,转换为日期对象
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDay = df.parse("1991-03-30");
        // b)把日期对象转换为对应的毫秒值
        long birthTime = birthDay.getTime();
        // c)获取当前系统的毫秒值
        long now = System.currentTimeMillis();
        // d)当前系统毫秒值-出生时间对于的毫秒值计算你活的毫秒值
        long liveTime = now - birthTime;
        // e)把你活毫秒值转换为天
        long day = liveTime / 1000 / 60 / 60 / 24;
        // f)输出天数
        System.out.println("活了" + day + "天");
    }

}
