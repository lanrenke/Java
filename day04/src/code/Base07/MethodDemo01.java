package code.Base07;
/**
 目标：研究方法重载。

 方法重载的概念：两同一不同。
     同一个类中，出现名称相同的多个方法，但是多个方法的形参列表是不同的，我们称为
     这些方法是重载方法。
     方法重载必须满足两同一不同：
         2同：  同一个类中，方法名称必须相同。
         1不同：形参列表必须不同。

 方法重载有啥用呢?
     案例：Java开发一个军用系统，
         需求默认要给小鬼子发送一枚导弹。
         需求指定国家默认发送1枚。
         需求指定国家可以发射多枚。

 功能都是为了发射导弹。方法名称应该一样。
     作用：可以通过方法名称说明方法都是完成同一个功能，但是参数的差异可以决定功能的不同。
     这是一种非常优雅的设计。

 注意：
     如果识别方法重载呢?
     方法重载只关心同一个类中，方法名称必须相同，形参列表必须不同，修饰符，返回值类型都不管！！
     形参列表不同：指的是类型不同，个数不同，顺序不同,不关心形参的名称。
     int a int b
     int i int j
 小结：
     同一个类中，方法名称相同，形参不同那就是方法重载！
 */
public class MethodDemo01 {

    public static void main(String[] args) {

        send();
        send("🦅国");
        send("米国",1000);

    }

    public static void send(){
        System.out.println("发射一枚给小鬼子！");
    }

    public static void send(String country){
        System.out.println("发射一枚给"+country+"!");
    }

    public static void send(String country,int num){
        System.out.println("发射"+num+"枚给"+country+"!");
    }

}
