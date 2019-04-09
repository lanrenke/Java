package code._02多态的优势和劣势;

/**
     目标：多态的优势和劣势以及使用前提。

     多态的使用前提有三点：
         Animal a1 = new Cat();
         a1.run();
         1.有继承或者实现关系。
         2.有子类对象赋值给父类引用
         3.要有方法重写
     多态的优势：
        右边的对象可以实现切换，实现组件化解耦思想。
        多态下，父类类型作为方法形参，此时所有子类对象都可以被接收！！
     多态的劣势:
         在多态下，子类特有的方法，无法被调用！！因为编译是看父类类型中的方法。
         所以子类特有的方法无法直接被调用。

 */
public class DuoTaiDemo {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        a1.run();
        //a1.lookDoor();// 在多态下，子类特有的方法，无法被调用！！因为编译是看父类类型中的方法。

    }

}

abstract class Animal{

    public abstract void run();

}

class Dog extends Animal {

    @Override
    public void run() {
        System.out.println("狗跑的贼快");
    }

    //独有方法
    public void lookDoor(){
        System.out.println("看门");
    }

}

class Wolf extends Animal {

    @Override
    public void run() {
        System.out.println("狼跑的贼贼快");
    }
}