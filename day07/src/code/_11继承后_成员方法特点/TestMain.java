package code._11继承后_成员方法特点;
/**
 目标：继承后——成员变量特点。

 1.子类访问成员方法是使用就近原则。
 -- 子类有就用子类的
 -- 子类没有找父类的
 -- 父类也没有就报错！

 */
public class TestMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run(); // 子类的
        d.eat(); // 父类
        // d.go(); // 报错！
    }
}

class Animal{
    public void run(){
        System.out.println("动物可以跑！");
    }

    public void eat(){
        System.out.println("动物吃东西！");
    }
}

class Dog extends Animal{
    public void run(){//这里已经算是 重写方法
        System.out.println("狗跑的贼快！！");
    }
}
