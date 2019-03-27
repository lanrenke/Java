package code.Base01.Base04;
/**
 目标：8种基本数据类型的定义和使用。

 变量的格式：
 数据类型 变量名称 = 初始值;

 数据类型有哪些？
 Java把数据类型设计成2大类：基本数据类型 ， 引用数据类型。
 1.基本数据类型：分为4大类8种。
 a.整型                    内存空间          类型数据范围
 byte  字节型          1个字节           -128~127     = 256个数据！！
 short 短整型          2个字节           -32768~32767
 int   整型（默认）    4个字节           -2147483648~2147483647
 long  长整型		  8个字节           很大
 b.浮点型(小数)
 float 单精度          4个字节
 double 双精度 （默认）8个字节
 c.布尔型
 boolean
 d.字符型
 char
 */
public class VariableDemo01 {

    public static void main(String[] args) {

        //byte 字节型
        byte age = 17;
        System.out.println(age);

        //short 短整型
        short st = 12345;
        System.out.println(st);

        //int 整型(默认)
        int num = 1234789;
        System.out.println(num);

        //long 长整型
        long lg = 2345768;
        System.out.println(lg);

        /*
        * 注意:随便写一个整数默认类型都是int类型，如果赋值的整数超出int的范围就会报错，所以需要赋值变量的值超过int范围时，需要在
        * 数值后面加上l或L；
        * */
        long lg2 = 12984857898546567L;
        System.out.println(lg2);

        //float 单精度 4个字节
        /*注意:随便写一个小数默认都是double类型，额需要赋值给float类型变量是肯定会超过float的范围，所以在赋值变量时需要在数值后面加上f
        或者
        * */
        float f1 = 0.9F;
        System.out.println(f1);

        //double 双精度 （默认）8个字节
        double d1 = 0.95;
        System.out.println(d1);

        //boolean
        boolean flag = true;
        boolean flag2 = false;
        System.out.println(flag);
        System.out.println(flag2);

        //char
        char c1 = 'a';
        char c2 = '中';
        char c3 = ' ';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }

}
