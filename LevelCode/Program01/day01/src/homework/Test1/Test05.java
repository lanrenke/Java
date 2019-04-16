package homework.Test1;

import java.util.Calendar;

/**
    需求：
        代码计算500天后是几几年几月几日
 */
public class Test05 {

    public static void main(String[] args) {

        //1.创建日历
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        System.out.println("增加前");
        System.out.println(year+"/"+month+"/"+day+" "+hour+":"+minute+":"+second);

        //2.增加500日
        //c.add(Calendar.DATE,500);这样写也可以
        c.add(Calendar.DAY_OF_MONTH,500);

        //3.获取对应的时间
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        hour = c.get(Calendar.HOUR);
        minute = c.get(Calendar.MINUTE);
        second = c.get(Calendar.SECOND);

        System.out.println("增加后");
        System.out.println(year+"/"+month+"/"+day+" "+hour+":"+minute+":"+second);


        //标准答案
        // a)获取当前日历对象
       /* Calendar c = Calendar.getInstance();
        // b)调用日期对象的add()方法,让当前日历向后移动500天
        c.add(Calendar.DATE, 500);
        // c)获取日历中的年,月,日
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        // d)输出几几年几月几日.
        System.out.println(year + "年" + month + "月" + day + "日");*/

    }

}
