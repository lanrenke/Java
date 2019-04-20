package homework.Test3.Test02;
/**
 创建线程的方式
 开启一个线程执行任务：随机获得10个100到1000的整数并将10个整数相加求和，将求和结果输出。
 */
public class Test02 {

    public static void main(String[] args) {

        Thread t = new MyThread();
        t.start();

    }

}
