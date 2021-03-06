package code._05抽象类的注意事项;
/**

 1. 抽象类**不能创建对象**，如果创建，编译无法通过而报错。只能创建其非抽象子类的对象。
    理解：假设创建了抽象类的对象，调用抽象的方法，而抽象方法没有具体的方法体，没有意义。

 2. 抽象类中，可以有构造器，是供子类创建对象时，初始化父类成员使用的。
    理解：子类的构造方法中，有默认的super()，需要访问父类构造方法。

 3. 抽象类中，不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
    理解：未包含抽象方法的抽象类，目的就是不想让调用者创建该类对象，通常用于某些特殊的类结构设计。

 4. 抽象类的子类，必须重写抽象父类中**所有的**抽象方法，否则子类也必须定义成抽象类，编译无法通过而报错。

 5. 抽象类存在的意义是为了被子类继承，抽象类体现的是模板思想。 拓展！
    理解：抽象类中已经实现的是模板中确定的成员，抽象类不确定如何实现的定义成抽象方法，交给具体的子类去实现。

 */
public class TestDemo {
}

// 抽象类中，不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
abstract class Animal{
    public void test(){

    }

    public abstract void test1();
}