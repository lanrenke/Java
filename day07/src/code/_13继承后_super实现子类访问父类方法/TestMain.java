package code._13继承后_super实现子类访问父类方法;
/**
 目标：继承后_super实现子类访问父类方法

 小结：
     super访问父类成员
     -- super.父类成员变量
     -- super.父类成员方法

 */
public class TestMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
//        dog.run();
        dog.start();

    }

}

class Animal{
    public void run(){
        System.out.println("动物可以跑！");
    }
}

class Dog extends Animal {
    @Override // 必须成功重写
    public void run(){
        System.out.println("狗跑的贼快！！");
    }

    public void start(){
        System.out.println("开始方法");
        super.run(); // 父类的
        run(); // 子类的
    }
}