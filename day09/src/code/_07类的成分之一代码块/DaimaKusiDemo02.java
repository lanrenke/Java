package code._07类的成分之一代码块;
/**
    拓展：类的五大成分之一：代码块

    类的五大成分：成员变量，方法，构造器，代码块 ，内部类。

    代码块：
        按照有无static修饰代码块可以分为：
        a.静态代码块:有static修饰，属于类，与类一起加载，是自动执行的，类加载的时候就执行了！
          优先与main方法执行的。
            static{
                // 执行代码
            }
            有啥用？可用可不用。用了以后代码的逼格很高！优雅。
            -- 可以用于在使用类之前进行静态资源的初始化操作（准备工作）

        b.实例代码块:无static修饰，属于类的对象，与对象一起加载，自动执行，每次创建对象都会先执行实例代码块。
            格式：
                {
                    // 执行代码
                }
            原理：实例代码块的原理是其中的代码是提取到每一个构造器中去的，所以创建对象才会被执行。
            实例代码块有啥用？爱用就用，可用可不用。提升逼格的。优雅
                作用：用于初始化实例资源。

 */
public class DaimaKusiDemo02 {

    private String name ;

    // 实例代码块
    {
        System.out.println("实例代码块被执行！");
        name = "黑马"; // 初始化实例资源！
    }

    public DaimaKusiDemo02(){

    }

    public DaimaKusiDemo02(String name){

//        {
//            // 局部代码块: 没任何屁用。只能范围内有效。
//            int age = 12 ;
//            System.out.println(age);
//        }
//        System.out.println(age); // 错的！

    }


    public static void main(String[] args) {
        new DaimaKusiDemo02(); // 匿名对象，没有名字的对象！
        new DaimaKusiDemo02(); // 匿名对象，没有名字的对象！
        new DaimaKusiDemo02(); // 匿名对象，没有名字的对象！
        new DaimaKusiDemo02("dlei"); // 匿名对象，没有名字的对象！
    }


}
