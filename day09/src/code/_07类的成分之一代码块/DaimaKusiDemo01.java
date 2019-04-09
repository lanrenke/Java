package code._07类的成分之一代码块;
/**
    目标：类的五大成分之一：代码块

    类的五大成分：成员变量，方法，构造器，代码块 ，内部类。

    代码块：
        按照有无static修饰代码块可以分为：
        a.静态代码块:有static修饰，属于类，与类一起加载，是自动执行的，类加载的时候就执行了！
          优先与main方法执行的。
            static{
                // 执行代码
            }
          有啥用？可用可不用。用了以后代码的逼格很高！
            -- 可以用于在使用类之前进行静态资源的初始化操作（准备工作）

        b.实例代码块。

 */
public class DaimaKusiDemo01 {
    public static String schoolName;

    static{
        System.out.println("静态代码块被执行！");
        schoolName = "黑马";
    }

    public static void main(String[] args) {
        System.out.println("==main==");
        System.out.println(schoolName);
    }

}
