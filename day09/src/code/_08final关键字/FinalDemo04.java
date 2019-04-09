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

    final修饰实例变量：变量有且仅能赋值一次。
        实例变量被final修饰后可以在哪些地方赋值一次
            -- 定义的时候赋值一次。
            -- 可以在实例代码块赋值一次。
            -- 必须在每个构造器中赋值一次。
 */
public class FinalDemo04 {
    public final String name = "黑马";
    public final String name1 ;
    public final String name2 ;
    {
        name1 = "黑马" ;
    }

    public FinalDemo04(){
        name2 = "黑马";
    }

    public FinalDemo04(String nmae){
        name2 = "黑马";
    }

    public static void main(String[] args) {
        FinalDemo04 f = new FinalDemo04();
        //f.name = "白马"; // 报错，只能赋值一次
        System.out.println(f.name);

        FinalDemo04 f11 = new FinalDemo04();
        System.out.println(f11.name);
    }
}
