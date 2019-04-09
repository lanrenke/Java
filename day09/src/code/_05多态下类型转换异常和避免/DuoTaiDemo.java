package code._05多态下类型转换异常和避免;
/**
    目标：多态下类型转换异常和避免。

    多态下强制类型转换可能出现：类型转换异常。ClassCastException

    语法：只要两个类型有继承关系，那么一定可以进行强制类型转换，编译阶段绝对不会报错！
          但是运行阶段可能出现类型转换异常。

    在强制类型转换之前，如果不能确定具体的类型
    Java建议我们使用instanceof关键字实现判断具体的类型然后进行强制类型转换。
         变量  instanceof  类型：判断前面的变量是否是后面的类型或者其子类类型。是返回true ,反之

    小结：
         1.只要有继承关系，在编译阶段就一定可以进行强制类型转换，一定不会错误。
         但是运行阶段可能出现类型转换异常。
         2.变量  instanceof  类型：判断前面的变量是否是后面的类型或者其子类类型。是返回true ,反之
 */
public class DuoTaiDemo {

    public static void main(String[] args) {

        Animal a1 = new Cat();
        //Cat cat = (Cat)a1; // 没有问题的，编译和运行都没有问题
        //Dog dog = (Dog)a1; // 没有问题的，编译没有问题,但是运行阶段出现类型转换异常ClassCastException

        // 如果避免类型转换异常
        // 在强制类型转换之前，如果不能确定具体的类型
        // Java建议我们使用instanceof关键字实现判断具体的类型然后进行强制类型转换。
        if(a1 instanceof Cat){
            Cat cat = (Cat)a1;
            System.out.println("转成猫");
        }else if(a1 instanceof Dog){
            Dog dog = (Dog)a1;
            System.out.println("转成狗");
        }

    }

}

class Animal{}

class Cat extends Animal{}

class Dog extends Animal{}