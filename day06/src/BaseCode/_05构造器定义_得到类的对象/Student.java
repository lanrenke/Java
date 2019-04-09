package BaseCode._05构造器定义_得到类的对象;
/**
    目标：构造器的定义，得到类的对象。

    构造器是类的成分之一。
    构造器的作用：可以通过调用类的构造器得到类的一个对象。

    构造器的定义格式：
        修饰符 类名(形参列表){
            // 执行代码
        }

    构造器的格式注意：
        修饰符：public | private | 缺省 | protected
        类名：必须与构造器所在类的类名一模一样，否则报错！
        构造器是没有返回值类型申明的，因为它不是方法定义!!!
    创建对象：
        格式：类名 对象名称 = new 构造器;


    小结：
        1.构造器的目的是为了得到类的对象，帮助初始化类的对象。
        2.通过new调用构造器得到类的对象。
        3.构造器是默认返回类的对象的，不能申明返回值类型，因为它不是方法定义!!!
        4.类只有一个，但是类的对象可以有千千万万个。

 */
public class Student {
    // 成员变量
    public String name ;
    public int age ;


    // 无参数构造器
    public Student(){
        System.out.println("无参数构造器");
    }

    // 有参数构造器
    public Student(String name){
        System.out.println("有参数构造器");
    }

    public static void main(String[] args) {
        // 创建类的对象:
        // 类名  对象名称 = new 构造器;
        Student mjj = new Student();
        mjj.name = "马俊杰";
        mjj.age  = 21 ;
        System.out.println(mjj.name);
        System.out.println(mjj.age);


        Student xzq = new Student();
        xzq.name = "许梓强";
        xzq.age  = 22 ;
        System.out.println(xzq.name);
        System.out.println(xzq.age);
    }
}
