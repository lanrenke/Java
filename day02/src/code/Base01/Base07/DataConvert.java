package code.Base01.Base07;
/**
 目标：数据类型转换-强制类型转换。
 研究表达式的自动类型提升语法规则：
 表达式：就是有+-* / 以及变量和常量一起运算
 a.表达式的最终结果类型是由表达式中的最高数据类型决定的，
 最高数据类型是什么，最终结果的数据类型就是什么。

 b.在表达式中，byte short , char是直接提升成int运算的
 byte ， short ，char  ->  int -> long  -> float  -> double

 小结：
 表达式的最终结果类型是由表达式中的最高数据类型决定的，
 最高数据类型是什么，最终结果的数据类型就是什么。
 在表达式中，byte short , char是直接提升成int运算的
 */
public class DataConvert {

    public static void main(String[] args) {

        byte b1 = 1;
        byte b2 = 2;
        int b3 = 3;
        int rs = b1 + b2 + b3;
        System.out.println(rs);

        byte c1 = 10;
        int c2 = 100;
        float c3 = 1.0F;
        double rs1 = c1 + c2 + c3;
        System.out.println(rs1);

    }

}
