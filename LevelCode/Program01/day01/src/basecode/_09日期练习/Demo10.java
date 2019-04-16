package basecode._09日期练习;

import java.util.Calendar;

/**
 需求：计算指定年份的2月份的天数
     2019  3 1

 分析：
     1. 创建日历对象
     2. 设置日历时间为指定年份的3月1号
     3. 将日向后偏移1天：减一天(2月最后一天)
     4. 获得当前月份的天数
 */
public class Demo10 {

    public static void main(String[] args) {

        //1. 创建日历对象
        Calendar c = Calendar.getInstance();//这里再次注意，日历类是不能直接创建对象的，需要使用方法建立

        //2. 设置日历时间为指定年份的3月1号
        c.set(2016,2,1);

        //3. 将日向后偏移1天：减一天(2月最后一天)
        c.add(Calendar.DAY_OF_MONTH,-1);

        //4. 获得当前月份的天数
        int year = c.get(Calendar.YEAR);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("指定"+year+"年的2月份的天数为"+day);

    }

}
