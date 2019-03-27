package code.Base01.Base06;
/**
 目标：数据类型转换-强制类型转换。
 强制类型转换的格式:
 数据类型 变量 = (数据类型)数据或者变量;

 a.数据超过了对应变量的类型范围就必须进行手工的强制类型转换，否则代码报错！！
 b.大范围类型的变量赋值给小范围类型的变量必须进行手工强制类型转换，否则代码报错！

 小结：
 强制类型转换 可能 出现数据失真（数据溢出）
 */
public class DataConvert {

    public static void main(String[] args) {

        // a.数据超过了对应变量的类型范围就必须进行手工的强制类型转换，否则代码报错！！
        byte age = (byte) 200;
        System.out.println(age);//输出-56 溢出导致输出异常。

        // b.大范围类型的变量赋值给小范围类型的变量必须进行手工强制类型转换，否则代码报错！
        long lg1 = 1;
        int i1 = (int)lg1;
        System.out.println(i1);

        // 注意：大范围类型的变量赋值给小范围类型的变量必须进行手工强制类型转换，否则代码报错！
        // 小数强制转换成整型，直接截断小数部分，保留整数部分
        double ab = 99.999;
        int i2 = (int)ab;
        System.out.println(i2);

    }

}
