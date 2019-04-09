package homework._接口类;
/**
 两个手机类OldPhone和NewPhone都有call()和sendMessage()方法.
    定义接口Play,Play中有一个抽象的玩游戏的方法playGame(),NewPhone实现Play接口有玩游戏的功能;
 要求:
     分别测试OldPhone和NewPhone的call()和sendMessage()方法,
     再测试新手机palyGame()的方法
 */
public class Test04 {

    public static void main(String[] args) {

        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        oldPhone.sendMessage();

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.palyGame();

    }

}

abstract class Phone{
    public abstract void call();
    public abstract void sendMessage();
}

interface Play{

    void palyGame();

}

class OldPhone extends Phone{

    @Override
    public void call() {
        System.out.println("旧手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("就手机发短信");
    }

}

class NewPhone extends Phone implements Play{

    @Override
    public void call() {
        System.out.println("新手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("新手机发短信");
    }

    @Override
    public void palyGame() {
        System.out.println("新手机打游戏");
    }

}