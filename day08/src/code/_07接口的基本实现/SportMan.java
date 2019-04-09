package code._07接口的基本实现;
/**
 目标：接口的基本实现。

 接口的目的是为了被子类：实现。

 类实现接口的格式：
     修饰符 class 实现类 implements 接口1,接口2,接口3,...{

     }

 注意：一个类可以实现多个接口 ，接口是可以被多实现的。
 注意：一个类实现了接口，必须重写完接口中全部的抽象方法 , 否则这个类也必须定义成抽象类。

 小结：
     接口体现的是规范，接口可以约束实现类必须完全接口中规定的功能！
     一个类可以实现多个接口。接口是可以被多实现的。
     一个类实现了接口，必须重写完接口中全部的抽象方法，否则这个类也必须定义成抽象类。

 */
public interface SportMan{
    void run();
    void comptition();
}

class PingPongMan implements SportMan{

    @Override
    public void run() {
        System.out.println("乒乓球运动员要跑步训练！");
    }

    @Override
    public void comptition() {
        System.out.println("乒乓球运动员必须比赛！");
    }

}

class Test{

    public static void main(String[] args) {

        PingPongMan zjk = new PingPongMan();
        zjk.run();
        zjk.comptition();

    }

}