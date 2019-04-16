package basecode._08Calendar类;

import java.util.Calendar;

/**
     目标：能够通过Calendar获取日期信息

     讲解：
         1. Date类的缺点
             Date主要是表示1970之后的毫秒值,Date类对单独获取年,月,日,时,分,秒,昨天,明天,上个星期,
             加上或减去一些时间不好处理

             Date类不支持国际化(不能根据对应的时区来切换显示方式)
             Calendar类支持国际化，如果开发的网站需要支持国际化，则选择Calender，如果不需要则随便选择。


         2. Calendar的作用
             非常方便的可以获取到年月日时分秒,昨天,前天,明天,上个星期,上个月,前几年…
             可以方便的调整时间

         3. 如何创建Calendar对象
             * 是一个抽象类，不能直接创建对象，只能创建子类对象
             * 通过Calendar类静态方法创建日历类对象，该方法如下：
                 * static Calendar getInstance() 获得日历对象

         4.Calendar类常用方法
             int get​(int field)
                 根据日历字段获得值
                 常用的日历字段：
                     年 Calendar.YEAR
                     月 Calendar.MONTH
                     日 Calendar.DAY_OF_MONTH
                     时 Calendar.HOUR
                     分 Calendar.MINUTE
                     秒 Calendar.SECOND

             void set​(int field, int value)
             * 修改指定日历字段的值为指定值value

             void add​(int field, int amount)
             * 将指定日历字段的值在当前值的基础上偏移一个值：amount
             * 正数：向前偏移 +
             * 负数：向后偏移 -

         5.Calendar注意事项
             MONTH: 取值范围0到11  需要加1才是我们正确的月份
             DAY_OF_WEEK: 1代表星期天

     小结：
         1. 如何获取Calendar对象
             static Calendar getInstance();
         2. 获取年、月、日等信息的方法
            int get(int field)
         3. 修改年、月、日等信息的方法
            void set(int field,int value)
         4. 添加和减去时间的方法
            void add(int field,int value)
 */
public class Demo08 {

    public static void main(String[] args) {

        // 获得日历对象
        Calendar c = Calendar.getInstance();//抽象类不能创建对象 但是可以创建子类对象 这里相当于new GregorianCalendar(),然后通过多态发方式来进行建立对象。
        /* Calendar类静态方法getInstance分析：
            public static Calendar getInstance(){
                return new GregorianCalendar();
            }
        */
        System.out.println(c.get(Calendar.DAY_OF_WEEK));//输出当天在一周 是周几(特别注意 一周开始的第一天是星期天 所以周日为1 周一为2)
        // 获得年
        int year = c.get(Calendar.YEAR);
        // 获得月
        int month = c.get(Calendar.MONTH);
        // 获得日
        int day = c.get(Calendar.DAY_OF_MONTH);//输出当天在 一个月中是 几号
        System.out.println(year+"-"+month+"-"+day);
        System.out.println("-------------------------");

        // 将年份修改为2020年
        c.set(Calendar.YEAR,2020);//注意set方法的参数和get方法参数的格式是一致的，所以要写准确格式。
        c.set(Calendar.MONTH,4);

        year = c.get(Calendar.YEAR);//重新取值
        month = c.get(Calendar.MONTH);

        System.out.println(year+"-"+month+"-"+day);

        System.out.println("------------------------");

        // 将年份向后偏移1年
        c.add(Calendar.YEAR,-4);
        c.add(Calendar.MONTH,6);//注意月份的参数的取值方法为0到11

        year = c.get(Calendar.YEAR);//重新取值
        month = c.get(Calendar.MONTH);

        System.out.println(year+"-"+month+"-"+day);//2016-10-15

        System.out.println("------------------------");
        c.add(Calendar.MONTH,12);//如果取12 会直接把年份往前进一年 如这里并没有对年份进行修改，但是由于月份直接增长12个月 所以会自动增加年份的值。
        //当然也不一定要是12，这里加上12 月份的不会变的，如果当前月份加上对应值超过12是会出现对应的变化
        //如上面输出的时候是 2016-10-15 如果月份加上4个月 就应该是2017-2-15

        year = c.get(Calendar.YEAR);//重新取值
        month = c.get(Calendar.MONTH);

        System.out.println(year+"-"+month+"-"+day);

    }

}
