package basecode._02异常处理_JVM处理;

/**
    目标：掌握JVM处理异常的方式

    小结：
        JVM处理异常的方式
            1.将异常信息(异常类名，异常原因，异常位置)输出到控制台
            2.退出JVM，终止程序运行。
 */
public class Demo02 {
    public static void main(String[] args){
        System.out.println(100/0);
    }
}
