package code._09继承_子类不能继承父类的东西;
/**
 目的：继承_子类不能继承父类的东西;

 认为：子类继承父类，子类就得到了父类的属性（成员变量），和行为（方法）

 研究：子类不能继承父类东西。
 确定观点： -- 1.子类不能继承父类的构造器。因为子类有自己的构造器。
 争议观点: -- 2.子类是否可以继承父类的私有成员。
 我认为子类是继承了父类的私有成员的，只是子类不能访问而已。

 */
public class Animal {
    private void sing(){
        System.out.println("快乐的歌唱！！");
    }
}

class Cat extends Animal{

}

class TestMain{
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        // cat.sing();

        // 其实子类是继承了的，我们可以暴力来访问，但是不能直接访问
//        Class<?> clazzCat = Animal.class ;
//        Method m = clazzCat.getDeclaredMethod("sing");
//        m.setAccessible(true);
//        m.invoke(cat);

    }
}
