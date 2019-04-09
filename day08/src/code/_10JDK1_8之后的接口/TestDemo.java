package code._10JDK1_8之后的接口;
/**
 目标：JDK 1.8开始之后接口新增的方法。

 JDK 1.8接口只有抽象方法和常量。
 JDK 1.8开始之后接口不再纯洁了，接口开始新增了三个方法：
     1.默认方法（其实就是我们写的实例方法，必须用实现类对象访问）
     2.静态方法（有static修饰的，必须只能用当前接口名访问。）
     3.私有方法（用private修饰的，只能在接口中被访问）。

 小结：
     默认方法：必须用default修饰，其实就是我们写的实例方法，必须用实现类对象访问
     静态方法：有static修饰的，必须只能用当前接口名访问。
     私有方法：用private修饰的，只能在接口中被访问
 */
public class TestDemo {

    public static void main(String[] args) {
        PingPongMan zjk = new PingPongMan();
        zjk.rule();
        zjk.run();
        SportMan.go(); // 接口的静态方法只能用接口名访问！
    }

}

class PingPongMan implements SportMan{

    @Override
    public void rule() {
        System.out.println("乒乓运动员要遵纪守法!");
    }
    // run() 实例方法，用对象访问
}

interface SportMan{

    // 抽象方法
    void rule();

    // 1.默认方法（实例方法，必须用default修饰）
    // 默认都是public 修饰
    default void run(){
        sleep();
        System.out.println("运动员跑步！");
    }

    // 2.静态方法
    // 默认都是public 修饰
    static void go(){
        System.out.println("开始去做事情！");
    }

    // 3.私有方法:给接口自己用的！掌握语法即可！
    private void sleep(){
        System.out.println("开始睡觉！");
    }

}