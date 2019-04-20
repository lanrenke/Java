package basecode._12创建线程;
/**
 目标：能够使用Thread类创建线程

     讲解：
         1. Thread类介绍
            线程类：只要创建该类的对象就是一个线程对象(工人)

         2. 创建线程的步骤

     小结：
         1. 创建线程的步骤
             1. 创建类继承Thread类
             2. 重写run方法：将线程任务相关的代码编写在该方法中
             3. 创建子类对象并调用start方法开启线程即可
 */
public class Demo12 {

    public static void main(String[] args) {

        Thread t =new MyThread();
        t.start();

    }

}
