package code.Base01.Base05;
/**
 目标：数据类型转换-自动类型转换。

 什么是数据类型？
 Java认为不同的变量和常量在一起运算后的结果的类型必须统一。
 所以不同类型之间是存在类型转换的。
 数据类型的转换方式：
 （1）自动类型转换。
 （2）强制类型转换。

 （3）表达式的自动类型提升。

 先研究自动类型转换的语法规则：
 a.数据如果在变量的类型范围之内是可以直接自动类型转换的。
 b.小范围类型的变量可以自动类型转换给大范围类型的变量
 类型范围：
 byte -> short -> int -> long  -> float  -> double
                 /
                 char
 小结：
 自动类型转换是小范围数据或者小范围变量可以直接赋值给大范围类型变量，编译不会出错！！

 */
public class DataConvert {

    public static void main(String[] args) {

        //小范围类型的变量可以自动类型转换给大范围类型的变量
        int money = 123456;
        long lg = money;
        System.out.println(money);
        System.out.println(lg);

    }

}
