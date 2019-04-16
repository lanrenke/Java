package basecode._07DateFormat类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
     目标：使用DateFormat类的方法将日期字符串转换为日期对象

     讲解：
         1. 为什么要将字符串转成Date对象
             例如某些小网站注册时需要选择生日，用户选择的年月日是一个字符串。
             服务器需要将当前时间和用户生日进行比较，判断用户年龄是否大于18岁。
             此时就需要将用户生日字符串先转换为Date对象。

         2. 需求: 将字符串 "2007-12-26 10:13:31" 转成 Date
             1. 日期字符串:String
             2. 创建日期格式化对象并指定日期模式：SimpleDateFormat
             3. 调用日期格式化对象的方法将日期字符串转换为日期对象：Date parse(String dateStr)

     小结：
         1. 如何将日期字符串转换为日期对象
             1. 创建日期格式化对象并指定日期模式：SimpleDateFormat
             2. 调用日期格式化对象的方法将日期字符串转换为日期对象：Date parse(String dateStr)
             注意事项：指定的日期模式和字符串日期模式要一致。

         2. DateFormat类常用方法的两个方法
             * String format(Date date) 日期转字符串
             * Date parse(String str) 字符串转日期
 */
public class Demo072 {

    public static void main(String[] args) throws ParseException {

        // 1. 日期字符串:String
        String dateStr = "2007/12/26";
        //String dateStr = "abc"; 例如这样的情况 就会导致异常

        // 2. 创建日期格式化对象并指定日期模式：SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");//注意一定要对应上字符串的格式，不然会报转换异常

        // 3. 调用日期格式化对象的方法将日期字符串转换为日期对象：Date parse(String dateStr)
        Date date = sdf.parse(dateStr); //由于没有办法预估到输入的到底是什么值，所以这里写上了throws ParseException 来抛出异常 使代码可以编译通过
        System.out.println(date);

    }

}
