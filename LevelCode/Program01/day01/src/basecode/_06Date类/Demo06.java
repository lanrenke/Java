package basecode._06Date类;

import java.util.Date;

/**
 目标：能够使用Date获得时间信息

 讲解：

     1. Date类概述
         * 类 Date 表示特定的瞬间，精确到毫秒。
         * 用来获得时间信息，可以精确到毫秒值。

     2. Date类常用构造方法
         * Date() 获得当前系统时间
         * Date(long time) 根据指定的毫秒值创建日期对象

     3. Date类常用方法
         * long	getTime()
         * 获得当前时间的毫秒值

     4. 1秒=1000毫秒

        时间零点：1970-1-1 00:00:00

 小结：
     1. Date类的作用：用来获得时间信息，可以精确到毫秒值。

     2. Date类常用构造方法
         Date(); 获得当前系统时间
         Date(long time) 根据毫秒值创建日期对象

     3. Date类常用成员方法
        long getTime(); 获得毫秒值
 */
public class Demo06 {

    public static void main(String[] args) {

        // 创建日期对象：当前系统时间
        Date d = new Date();
        //Mon Apr 15 16:13:33 CST 2019 CST China Standard Time 中国标准时间
        System.out.println(d);//这里很明显已经重写了toString方法(如果没有重写是会输出类全名和内存地址的)
        // 获得当前时间的毫秒值：1555316013066
        System.out.println(d.getTime());

        // Date(long time) 根据指定的毫秒值创建日期对象
        Date d1 = new Date(1555316013066L);//注意写上L 不然会超过Int 范围会报错
        System.out.println(d1);

    }

}
