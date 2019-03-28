package ck.basecode.day04.demo01;
/**
 * 方法重载的意义：
 *      意义是在方法名称相同的情况（这些方法的功能和目的都是一样的，可读性非常好）
 *      形参列表不同：可以实现相同功能，不同的效果。
 *      这是一种优美的设计。
 *
 * 注意：重载只关心方法名称相同，形参列表不同，其他都不管
 *      只要方法名称相同，形参列表不同那就是方法重载。
 *
 */
public class Test11 {

    public static void main(String[] args) {

        send("美国",100);

    }

    public static void send(){
        System.out.println("发送给日本1颗！！");
    }

    public static void send(String country){
        System.out.println("发送给"+country+"1颗");
    }

    public static void send(String country,int num){
        System.out.println("发送给"+country+num+"颗");
    }

}
