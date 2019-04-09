package code._15继承后_子类访问父类的构造器初始化对象数据;

import javafx.scene.AmbientLight;

/**
 目标：继承后_子类访问父类的构造器初始化对象数据

 super(...):可以根据参数去匹配调用父类的构造器。
    子类可以通过super调用父类的构造器去初始化当前对象的数据。

 注意：
    super(...)只能放在子类构造器的第一行，否则报错！！

 */
public class TestMain {

    public static void main(String[] args) {

        Dog dog = new Dog("泰迪",2);
        //dog.setAge(5); 也可以直接使用setter方法来进行赋值
        System.out.println(dog.getName());
        System.out.println(dog.getAge());

    }

}

class Dog extends Animal{

    public Dog(String name, int age) {

        super(name,age);

    }

}

class Animal{

    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}