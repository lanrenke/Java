package code._06多态的综合案例;
/**
 拓展：多态的综合案例

     案例需求：
     做一个电脑设备，可以接入USB设备（鼠标，和键盘）
     鼠标有（接入，拔出，双击666功能），键盘（接入，拔出，输入我在黑马学Java，很Happy!!）
     分析：
     键盘和鼠标都要实现USB规范。

 */
public class DuoTaiDemo {

    public static void main(String[] args) {

        Computer computer = new Computer("Mac苹果电脑");
        KeyBoard keyBoard = new KeyBoard("罗技键盘");
        Mouse mouse = new Mouse("雷蛇鼠标");

        computer.install(keyBoard);
        computer.install(mouse);

    }

}

class Computer{

    private String name;

    public Computer(String name) {
        this.name = name;
    }

    // 提供一个功能：USB接口
    public void install(USB usb){

        System.out.println(name+"被启动！");
        usb.connect();

        if (usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.keyDown();
        }else if (usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.dbClick();
        }

        usb.unconnect();
        System.out.println(name+"被关机！");

    }

}

// 定义USB规范：是接口。
// 接口是规范
interface USB{
    void connect();
    void unconnect();
}

class KeyBoard implements USB{

    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name+"键盘被接入到电脑设备");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"键盘拔出电脑成功！");
    }

    // 独有功能
    public void keyDown(){
        System.out.println(name+"写了我在黑马快乐的学习！很happy!");
    }

}

class Mouse implements USB{

    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name +"鼠标接入电脑成功！");
    }

    @Override
    public void unconnect() {
        System.out.println(name +"鼠标弹出电脑成功！");
    }

    public void dbClick(){
        System.out.println(name+"鼠标双击了666！！");
    }

}