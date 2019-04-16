package homework.Test1;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 需求说明
 获取当前的日期,并把这个日期转换为指定格式的字符串。如：2088-08-08 08:08:08
 */
public class Test03 {

    public static void main(String[] args) {

        //创建时间对象
        Date date = new Date();

        //创建DateFormat 对象 通过多态的方式 (因为在SimpleDateFormat中没有转换字符串的方法 而在父类中有)
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //使用父类的format方法 把对象转换成字符串
        String dataStr = df.format(date);

        System.out.println(dataStr);

    }

}
