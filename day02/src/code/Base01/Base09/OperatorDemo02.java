package code.Base01.Base09;
/**
 目标：研究运算符。
 什么是运算符：
 是对常量和变量进行运算的符号。
 运算符在表达式中经常使用。

 Java的运算符有哪些呢？
 运算符的分类:
 1.算数运算符
 + - * / % ++ --
 -- 基本的算术运算符：+ - * / %
 -- 自增自减运算符: ++（自增） , --（自减）
 a.++ , -- 用在变量的运算上的，可以对变量进行+1 ， -1
 b.++ , -- 在与变量单独运算的时候，放在变量的前后是没有区别的。
 都是对变量进行+1和-1操作。
 c.++ ， -- 在表达式中与变量运算的时候，放在变量前后是有差别的。
 在表达式中，++，--如果放在变量的前面，会先对变量进行+1或者-1然后再拿变量的值进行运算。
 在表达式中，++，--如果放在变量的后面，会先拿变量的值进行运算，然后再对变量的值进行+1或者-1

 */
public class OperatorDemo02 {

    public static void main(String[] args) {

        /**
         b.++ , -- 在与变量单独运算的时候，放在变量的前后是没有区别的。
         都是对变量进行+1和-1操作。
         */
        int a = 10;
        a++;
        System.out.println(a);

        int a1 = 10;
        ++a1;
        System.out.println(a1);

        int b = 10;
        b--;
        System.out.println(b);

        int b1 = 10;
        --b1;
        System.out.println(b1);

        System.out.println("----------------拓展------------------");
        /**
         ++ ， -- 在表达式中与变量运算的时候，放在变量前后是有差别的。
         在表达式中，++，--如果放在变量的前面，会先对变量进行+1或者-1然后再拿变量的值进行运算。
         在表达式中，++，--如果放在变量的后面，会先拿变量的值进行运算，然后再对变量的值进行+1或者-1
         */
        int c = 10;
        int rs1 = c++;
        System.out.println(c);
        System.out.println(rs1);

        int d = 10;
        int rs2 = ++d;
        System.out.println(d);
        System.out.println(rs2);




    }

}
