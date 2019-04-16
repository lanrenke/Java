package basecode._14教学目标小结;

/**
 - 能够说出Object类的特点
    所有类的父类

 - 能够重写Object类的toString方法
    重写的目的：打印对象时希望看到对象的内容
    默认打印的是：类全名@地址值

 - 能够重写Object类的equals方法
    重写的目的：希望通过比较对象的内容判断对象是否相同
    默认是通过比较地址值判断

 - 能够使用日期类输出当前日期
    Date d = new Date();

 - 能够使用将日期格式化为字符串的方法
    1. SimpleDateFormat sdf = new SimpleDateFormat("日期模式");
    2. String str = sdf.format(Date d);

 - 能够使用将字符串转换成日期的方法
    1. SimpleDateFormat sdf = new SimpleDateFormat("日期模式");
    2. Date d = sdf.parse(String dateStr)

 - 能够使用System类的数组复制方法
    static void arraycopy(Object src,int srcPos,Object dest,int destPost,int length)

 - 能够使用System类获取当前毫秒时刻值
    static long currentTimeMillis();

 - 能够说出使用StringBuilder类可以解决的问题
    字符串拼接耗内存耗时间

 - 能够使用StringBuilder进行字符串拼接操作
    StringBuilder append(数据类型 变量名)

 - 能够说出8种基本类型对应的包装类名称
    int ==> Integer
    char ==> Character

 - 能够说出自动装箱、自动拆箱的概念
    基本数据类型自动转换为包装类类型
    包装类类型自动转换为基本数据类型

 - 能够将字符串转换为对应的基本类型
    int Integer.parseInt(String str);
    ...

 - 能够将基本类型转换为对应的字符串
    int num = 100;
    String str01 = num + "";
    String str02 = Integer.toString(num);

 */
public class Demo15 {
}
