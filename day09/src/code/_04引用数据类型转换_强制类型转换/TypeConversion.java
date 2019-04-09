package code._04引用数据类型转换_强制类型转换;
/**
    目标：引用数据类型转换_强制类型转换

    引用数据类型转换_强制类型转换：
        把父类类型的变量赋值给子类类型的变量必须强制类型转换。（因为父类类型范围大，子类类型范围小）
    强制类型转换的格式：
         子类类型 变量名称 = (子类类型)父类类型变量;
    小结：
         把父类类型的变量赋值给子类类型的变量必须强制类型转换
         强制类型转换可以解决多态的劣势：可以实现调用子类独有的方法。
 */
public class TypeConversion {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        a1.run();
        Dog dog = (Dog)a1;// 引用数据类型转换_强制类型转换
        dog.lookDoor();

        Animal a2 = new Wolf();
        a2.run();
        Wolf wolf = (Wolf)a2;// 引用数据类型转换_强制类型转换
        wolf.catchSheep();

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

    // 独有的方法
    public void lookDoor(){
        System.out.println("看门");
    }
}

class Wolf extends Animal {
    @Override
    public void run() {
        System.out.println("狼跑的贼贼快");
    }

    // 独有的方法
    public void catchSheep(){
        System.out.println("狼抓羊羊吃！");
    }
}