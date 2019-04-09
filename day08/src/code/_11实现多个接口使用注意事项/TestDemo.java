package code._11实现多个接口使用注意事项;
/**
 目标：实现多个接口使用注意事项
     多个接口同名静态方法：
        如果实现了多个接口，多个接口中存在同名的静态方法并不会冲突，原因是只能通过各自接口名访问静态方法
     实现类访问优先级：
        当一个类，既继承一个父类，又实现若干个接口时，父类中的成员方法与接口中的默认方法重名，
        子类就近选择执行父类的成员方法
        注意：继承必须在前，实现必须在后，先用继承的，再用实现的。

     一个类实现了2个接口，2个接口中有相同的默认方法,此时实现类必须重写这个方法。
 */
public class TestDemo {

    public static void main(String[] args) {

        C c = new C();
        c.run();
        A.eat();
        B.eat();

    }

}

interface A{
    default void run(){
        System.out.println("运动员跑步");
    }

    static void eat(){
        System.out.println("A eat");
    }

}

interface B{
    default void run(){
        System.out.println("运动员跑步");
    }

    static void eat(){
        System.out.println("B eat");
    }

}

class C implements  A , B{

    @Override
    public void run() {
        System.out.println("子类运动员跑步");
    }
}