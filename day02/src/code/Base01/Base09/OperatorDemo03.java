package code.Base01.Base09;
/**
 目标:
 +符号在字符和字符串中的操作。
 总规则：
 +符号与字符串运算的时候是用作连接符的。
 +符号与任何字符串连接的结果依然是一个字符串。
 整数与字符做运算的直接拿值运算。不会做连接了！

 能算则算，不能算就粘在一起！！

 */
public class OperatorDemo03 {

    public static void main(String[] args) {

        int a = 5;
        // + 遇到字符串表示连接
        System.out.println("abc"+'a');  //abca
        System.out.println("abc"+a);    //abc5
        System.out.println("abc"+5+'a');//abc5a
        System.out.println(15+"abc"+15);//15abc15
        System.out.println(a+'a');      //5+97=102
        System.out.println(a+'a'+"abc");//102abc

    }

}
