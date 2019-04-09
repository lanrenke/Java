package code._10继承后_成员变量特点;
/**
 目标：继承后——成员变量特点。

 1.子类访问成员变量是使用就近原则。
     -- 局部范围有找局部范围。
     -- 局部范围没有找子类成员变量范围。
     -- 子类成员变量范围没有找父类的成员变量范围。
     -- 父类也没有就报错！

 小结：
 如果要指定访问子类对象的变量，请加上this
 如果要指定访问父类引用的变量，请加上super:  super.父类成员变量名

 */
public class TestMain {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.showName();

    }

}

class Animal{
    public String name = "动物名称";
}

class Cat extends Animal{
    public String name = "猫名称";
    public void showName(){

        String name = "叮当猫";

        System.out.println(name);       // 局部变量
        System.out.println(this.name);  // 子类变量
        System.out.println(super.name); // 父类变量

    }
}