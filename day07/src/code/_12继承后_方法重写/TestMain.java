package code._12继承后_方法重写;
/**
 目标：继承后——方法重写。

 方法重写的概念：
     子类继承了父类，子类得到了父类的某个方法
     但是子类认为继承自父类的该方法不够强大或者无法满足自己的需求。
     子类重写一个与父类的方法申明一样的方法来覆盖父类的该方法，这就是方法重写。

 子类重写方法后：子类以后就会用自己重写的方法了。

 方法重写的强制性要求：
     -- 重写方法的名称和形参必须与父类被重写方法一模一样。
     -- 申明不变，重新实现。
 方法重写的注解：@Override.
     如果一个方法用了@Override注解修饰，那么这个方法就必须是成功重写父类的方法。
     @Override是重写方法的校验注解，加上重写方法会更安全，代码可读性更好，更加规范！！

 小结：
     重写方法的名称和形参必须与父类被重写方法一模一样。
     建议重写方法都加上@Override

 */
public class TestMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.run();

    }

}

class Animal{

    public void run(){
        System.out.println("动物可以跑");
    }

}

class Dog extends Animal{

    @Override// 必须成功重写
    public void run(){
        System.out.println("狗跑的贼快！");
    }

}