package homework;
/**
 请编写一个接口 Player,包含 playBasketball,playPingpong 2 个抽象方法,
 在测试类中使用匿名 内部类方式创建对象,并调用这 2 个功能
 */
public class Test03 {

    public static void main(String[] args) {

        Player player = new Player() {
            @Override
            public void playBasketball() {
                System.out.println("打篮球");
            }

            @Override
            public void playPingpon() {
                System.out.println("打乒乓球");
            }
        };
        player.playBasketball();
        player.playPingpon();
    }

}

interface Player{
    void playBasketball();
    void playPingpon();
}
