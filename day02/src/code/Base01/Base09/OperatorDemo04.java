package code.Base01.Base09;
/**
 2`赋值运算符`
 基本的赋值运算符：=
 扩展的赋值运算符：+= , -= , *= , /= , %=
 注意：扩展运算符自带强制类型转换
 a += b ;   // 公式： a = (a的数据类型)(a+b);
 a -= b ;   // 公式： a = (a的数据类型)(a-b);
 a *= b ;   // 公式： a = (a的数据类型)(a*b);
 a /= b ;   // 公式： a = (a的数据类型)(a/b);
 a %= b ;   // 公式： a = (a的数据类型)(a%b);

 */
public class OperatorDemo04 {

    public static void main(String[] args) {

        int age = 12; //  = 从右边往左执行！

        // 扩展赋值运算符。
        int a = 10;
        int b = 10;
        System.out.println(a+=b);
        //System.out.println(a-=b);
        //System.out.println(a*=b);
        //System.out.println(a/=b);
        //System.out.println(a%=b);

    }

}
