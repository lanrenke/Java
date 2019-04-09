package code._05内部类_匿名内部类;
/**

 目标：匿名内部类。

 什么是匿名内部类？
    也是一个局部内部类。是一个没有名字的局部内部类。

 匿名内部类的作用：
    简化代码！！！

 匿名内部类：
     new 父类|接口(参数){
        重写方法;
    };

 匿名内部类的关键：
     是一个没有名字的内部类。
     匿名内部类一写出来就自动创建了一个对应的对象。
     右边的对象是匿名内部类的对象。
 小结：
     匿名内部类是简化代码的。
     匿名内部类一写出来就自动创建了一个对应的对象
     匿名内部类只能有一次，适合只需要创建一个对象的地方。

 */
public class AnonymityDemo {

    public static void main(String[] args) {

        Animal Dog = new Animal() {
            @Override
            public void run() {
                System.out.println("狗跑的很快");
            }
        };
        Dog.run();

        Animal Wolf = new Animal() {
            @Override
            public void run() {
                System.out.println("狼跑的贼快");
            }
        };
        Wolf.run();

    }

}

abstract class Animal{
    public abstract void run();
}