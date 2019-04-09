package code._08final关键字;
/**
    目标：final关键字的学习。

    final可以修饰类，方法，变量。
        -- final修饰类，类不能被继承了。
        -- final修饰方法，方法不能被子类重写。
        -- final修饰变量：变量有且仅能被赋值一次。

    final和abstract是互斥的,final和abstract不能同时出现修饰方法或者类。

 */
public class FinalDemo01 {

}

class Animal{
    public final  void run(){

    }
}

class Dog extends Animal{
   /* @Override
    public void run(){
        System.out.println("");
    }*/
}


/*
final class Animal{

}
class Cat extends Animal{

}
*/
