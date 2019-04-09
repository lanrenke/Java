package code._08final关键字;
/**
    目标：final修饰变量。

    final修饰变量的总规则：
        变量有且仅能被赋值一次，第二次赋值直接报错！

    final修饰局部变量：变量有且仅能赋值一次。常量的概念！
        局部变量最多只能用final修饰！！！

    题目全部做：
            权限。
 */
public class FinalDemo02 {
    public static void main(String[] args) {
        final int age = 12 ;
        // 报错！只能赋值一次！
//        age = 12 ;

        final int age1 ;
        age1 = 13 ;
        // 报错！只能赋值一次！
        // age1 = 14 ;


        final double rate = 3.14;  // 最终，被保护不可修改！！！

        calc(3.14);
    }

    public static void calc(final double rate){

    }
}
