package code._01抽象类的概述;
/**
 目标：抽象类的概述。

 什么是抽象类？
     一个类觉得子类一定要完成这个功能，但是每个子类具体怎么完成是不一样的。
     父类就把这个功能定义成抽象方法，具体实现交给具体的子类来重写。
     拥有抽象方法的类就定义成抽象类。
     抽象类的定义：必须用abstract修饰这个类。

 什么是抽象方法？
     抽象方法是没有方法体，只有方法签名，必须用abstract修饰。
     注意：一个类有了抽象方法，必须定义成抽象类。否则报错！

 小结：
     抽象类是认为子类一定要完成某个功能，但是怎么实现是子类自己决定的，
     就定义一个抽象方法来约定子类一定要完成这个功能。
     一个类有了抽象方法，必须定义成抽象类。否则报错！
     抽象类和抽象方法都必须用abstract关键字修饰。

 */
public class TestDemo {
}

abstract class Animal{
    public abstract void run();
}

class Dog extends Animal{

    @Override
    public void run(){
        System.out.println("狗跑的飞快！！");
    }

}

class Wolf extends Animal{

    @Override
    public void run() {
        System.out.println("狼跑的贼快！！");
    }

}