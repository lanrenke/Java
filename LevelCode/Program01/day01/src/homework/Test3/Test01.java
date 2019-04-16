package homework.Test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 需求说明

 使用SimpleDateFormat类把2016-12-18转换为2016年12月18日.

 提示: SimpleDateFormat对象的日期格式字符串可以通过applyPattern(String pattern)进行修改

 */
public class Test01 {

    public static void main(String[] args) throws ParseException {

        //1.创建方法类对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //2.创建字符串
        String dateStr = "2016-12-18";

        //3.转换成日期对象
        Date data = sdf.parse(dateStr);

        //4.修改格式
        sdf.applyPattern("yyyy年MM月dd日");

        //5.再次转换成字符串输出
        String newStr = sdf.format(data);//这里也可以调用format 方法 因为继承关系

        System.out.println(newStr);

    }

}
