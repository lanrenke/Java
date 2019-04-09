package code._03抽象类的特征;
/**
 目标：抽象类的特征。

 抽象类的特征：
     有得有失。
         有得：抽象类拥有了得到抽象方法的能力。
         有失：抽象类失去了创建对象的能力。
         -- 抽象类有成员变量，构造器，普通方法
         -- 但是抽象类依然不能创建对象。

 为什么抽象类不能创建对象?
     反证法：假如抽象类可以创建对象
     Animal a = new Animal();
     a.run(); // run无法运行，没有方法体！
     所以抽象类不能创建对象。因为抽象类中有抽象方法。

 小结:
 抽象类是有得有失。
 有得：抽象类得到拥有抽象方法的能力。
 有失：抽象类失去了创建对象的能力。
 抽象类只是有得有失，其他东西抽象类都有。

 为什么抽象类不能创建对象，但是依然要有构造器？
     抽象类就是为了被子类继承。
     创建子类对象的时候，子类的构造器一定要调用父类构造器。
     所以抽象类必须有构造器。

     为什么类是单继承的?
     Java是单继承的，为什么？
     反证法：假如Java是多继承的。
     请看如下代码：
     class A{
         public void test(){
            System.out.println("A");
         }
     }
     class B{
         public void test(){
             System.out.println("B");
         }
     }
     class C extends A , B{
         public static void main(String[] args){
             C c = new C();
             c.test(); // 出现类的二意性！所以不能多继承。只能单继承！
         }
     }

 */
public class TestDemo {
}
