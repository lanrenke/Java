package code._14继承后_构造器的特点;
/**
 目标：继承后——构造器的特点。

 语法原则：子类的所有构造器都默认会先调用父类的无参数构造器再执行自己。

 为什么子类构造器一定要先调用父类构造器：
     1.子类构造器的第一行默认有一个super()调用父类无参数构造器，即使不写它也默认有。
     2.子类对象要使用父类对象的数据，所以在创建子类对象的时候，子类构造器
     一定要先调用父类构造器去初始化父类对象数据，以便子类使用（必须先有爸爸，才能有孩子）。
 */
public class TestMain {

    public static void main(String[] args) {

        Wolf wolf = new Wolf();
        System.out.println("---------------");
        Wolf wolf1 = new Wolf("狼");

    }

}

class Animal{

    public Animal() {

        System.out.println("Animal父类无参数构造器");

    }
}

class Wolf extends Animal{

    public Wolf() {

        //super(); // 调用父类无参数构造器，即使不写它也默认有。
        System.out.println("Wolf子类无参数构造器");

    }

    public Wolf(String name) {

        //super(); // 调用父类无参数构造器，即使不写它也默认有。
        System.out.println("Wolf子类有参数构造器");

    }
}