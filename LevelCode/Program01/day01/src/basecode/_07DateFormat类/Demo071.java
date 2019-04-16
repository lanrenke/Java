package basecode._07DateFormat类;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
     目标：使用DateFormat类的方法将对日期进行格式：将日期对象转换为字符串

     讲解：
         1. 为什么要DateFormat类: 日期格式化类
             Date主要表示1970年到某个时间的毫秒值,如果输出给用户看,用户是看不太懂的:
             "Thu Oct 25 21:41:33 CST 2018"
             用户实际上比较喜欢的日期格式有以下几个：
             "2019年10月25日 21时41分33秒"
             "2019-10-25 21:41:33"
             "2019/10/25 21:41:33"

         2. DateFormat类的作用:
             1. 将日期对象转换为字符串：Date ==> String
             2. 将日期字符串转换为日期对象：String ==> Date

         3. 如何创建DateFormat对象
             * DateFormat是一个抽象类，不能直接创建该类对象，只能创建子类对象。
             * 已知直接子类有：SimpleDateFormat
             * 直接创建SimpleDateFormat对象，调用方法进行格式化操作即可。

         4. SimpleDateFormat类常用构造方法
             * SimpleDateFormat(String pattern)
             *  根据日期模式创建日期格式化对象

                 * 日期模式
                 * yyyy  年   2019
                 * MM    月   04
                 * dd    日   15
                 * HH    时   10
                 * mm    分   16
                 * ss    秒   50

         5. 需求:将 Date 转成 "2018年9月15日 19时18分19秒"


     小结：
         1. 如何将日期对象转换为指定格式的字符串
             1. 创建日期格式化对象并指定日期模式：SimpleDateFormat对象
             2. 通过日期格式化对象调用format方法传递日期对象
 */
public class Demo071 {

    public static void main(String[] args) {

        // 需求:将 Date 转成 "2019年09月15日 19时18分19秒"
        // 获得日期对象
        Date d = new Date();

        // 创建日期格式化对象并指定日期模式
        // 2019年09月15日 19时18分19秒
        DateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        // 将日期对象转换为字符串
        System.out.println(sdf.format(d));//调用的是父类的format方法。虽然DateFormat是抽象类，但是抽象类是可以有其他方法的，不一定全部都是抽象方法。

        // 2019-10-25 21:41:33d
        DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//可以有很多格式，但是一定要符合日期模式
        // 将日期对象转换为字符串
        String dateStr = sdf2.format(d);
        System.out.println(dateStr);

    }

}
