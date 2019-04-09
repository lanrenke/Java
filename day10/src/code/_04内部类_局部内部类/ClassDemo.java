package code._04内部类_局部内部类;
/**
 目标：局部内部类。

 局部内部类，定义再方法中，一切局部代码块里面的内部类。
 没啥用！！

 局部内部类中可以定义静态成员吗？不可以的
 可以定义常量和实例成员！

 */
public class ClassDemo {
    static {
        class B{

        }
    }

    public ClassDemo(){
        class C{

        }
    }

    public static void main(String[] args) {
        test();
        test();
        test();
    }

    public static void test(){
        class A{
            private String name;
            // 可以定义常量。
            public static final int age = 12;
        }
        A a = new A();
    }
}
