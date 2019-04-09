package code._02抽象类的使用;
/**
 目标：抽象类的使用。

 定义抽象类：
     父类觉得子类要完成某个功能，具体怎么完成每个子类是不同的，这个
     就把父类定义成抽象类。
 如何使用抽象类：
    抽象类存在的意义就是为了被子类继承，否则毫无意义。
 注意：
     1.一个类如果继承了抽象类，必须重写这个抽象类的全部抽象方法，
     否则这个类也必须定义成抽象类。

 小结：
     一个类如果继承了抽象类，必须重写这个抽象类的全部抽象方法，
     否则这个类也必须定义成抽象类。
 */
public class TestDemo {
}

abstract class Animal{
    public abstract void run();
    public abstract void eat();
}

class Wolf extends Animal{

    //重写了所有抽象方法
    @Override
    public void run() {
        System.out.println("狼跑的飞快！");
    }

    @Override
    public void eat() {
        System.out.println("狼吃羊肉！");
    }

}

abstract class Dog extends Animal{

    //只重写了一个抽象方法 所以必须是抽象类
    @Override
    public void run() {

    }

}
