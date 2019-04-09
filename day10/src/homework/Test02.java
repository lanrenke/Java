package homework;
/**
    请编写一个抽象类Phone,
    两个抽象方法,call() sendMessage()
    使用匿名内部类的方式调用 call 和 sendMessage方法
 */
public class Test02 {

    public static void main(String[] args) {

        Phone phone = new Phone() {
            @Override
            public void call() {
                System.out.println("Calling.......");
            }

            @Override
            public void sendMessage() {
                System.out.println("Sending.......");
            }
        };
        phone.call();
        phone.sendMessage();

    }

}

abstract class Phone{
    public abstract void call();
    public abstract void sendMessage();
}