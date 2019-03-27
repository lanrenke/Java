package code.Base01.Base09;
/**
 3.`比较运算符`
 比较运算符又叫关系运算符，是两个数据之间进行比较的运算，
 运算结果都是布尔值`true`或者`false` 。
 符号：
 >
 >=
 <
 <=
 ==
 !=
 小结：
 1.判断是否相等必须是“==”。不是“=”。
 2.比较运算符的结果一定是布尔类型的结果。false ，true。

 */
public class OperatorDemo05 {

    public static void main(String[] args) {

        int a = 10;
        int b = 9;
        System.out.println(a > b); //true
        System.out.println(a >= b);//true
        System.out.println(a < b); //false
        System.out.println(a <= b);//false
        System.out.println(a == b);//false
        System.out.println(a != b);//true

    }

}
