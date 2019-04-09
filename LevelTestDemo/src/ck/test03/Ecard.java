package ck.test03;

public interface Ecard {

    default void connect(){
        System.out.println("已连接卡电子充值服务，可以使用充值功能");
    }

    void recharge (Card card,int num);

}
