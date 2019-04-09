package code._01多态的概念;
/**
     目标：多态的概念和多态的形式。

     多态的形式的引入：
         父类类型 对象变量 = new 子类的构造器;
         Animal  cat    = new Cat();

         父类接口 对象变量 = new 实现类构造器;
         SportMan zjk   = new PingPongMan();

     多态的概念：
        同一个事物在调用同一个方法的时候，在不同状态下会出现不同的行为。

     多态的识别：
         方法调用： 编译看左边，运行看右边。
         变量的调用：编译看左边，运行也看左边。

 */
public class DuoTaiDemo {

    public static void main(String[] args) {

        //  父类类型 对象变量 = new 子类的构造器;
        //  子类类型的范围小于父类类型的范围。
        //  狗继承了动物，狗也是动物类型。
        Animal a1 = new Dog();
        a1.run();
        System.out.println(a1.name);

        Animal a2 = new Wolf();
        a2.run();
        System.out.println(a2.name);

    }

}

abstract class Animal{

    public String name = "动物";
    public abstract void run();

}

class Dog extends Animal{

    public String name = "狗";
    @Override
    public void run() {
        System.out.println("狗跑的贼快");
    }

}

class Wolf extends Animal{

    public String name = "狼";
    @Override
    public void run() {
        System.out.println("狼跑的贼贼快");
    }
}