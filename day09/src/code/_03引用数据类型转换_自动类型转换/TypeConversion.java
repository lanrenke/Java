package code._03引用数据类型转换_自动类型转换;
/**
     目标：引用数据类型转换_自动类型转换

     基础阶段已经学习过：基本数据类型转换
         小范围类型的数据或者变量可以自动转换给大范围类型的变量。
         大范围的数据或者大范围类型的变量赋值给小范围类型的变量，必须强制类型转换。

     引用数据类型转换是一样的：
        我们认为父类的类型范围大，子类的类型范围小。

     引用数据类型的自动类型转换（向上转型）
        子类对象可以直接自动类型转换给父类类型的变量。（子类范围小，父类范围大）

 */
public class TypeConversion {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        Dog d = new Dog();
        Animal a3 = d ;
    }
}

class Animal{

}
class Cat extends Animal{

}

class Dog extends Animal{

}