package code._08final关键字;
/**
    目标：final修饰变量。

    final修饰变量的总规则：
        变量有且仅能被赋值一次，第二次赋值直接报错！

    final修饰局部变量：变量有且仅能赋值一次。常量的概念！
        局部变量最多只能用final修饰！！！

    final修饰静态变量：变量有且仅能赋值一次。
        静态变量被final修饰后可以在哪些地方赋值一次
            -- 定义的时候可以赋值一次
            -- 可以在静态代码块赋值一次。

 */
public class FinalDemo03 {
    // 常量：就是有public static final修饰，名称全部大写，多个单词用_连接
    public static final int AGE = 12;

    public static final int AGE1;
    // 语法：提升逼格！
    static{
        AGE1 = 13;
    }

    public static void main(String[] args) {
    }
}
