package basecode._03异常处理_捕获处理;
/**
 目标：能够捕获处理异常

     讲解：
     1. 捕获处理异常格式
         try{
            // 编写可能会出现异常的代码
         } catch(异常类名 变量名){
             // 处理异常的代码
         }
         1.1 try代码块
             编写可能会出现异常的代码
         1.2 catch代码块
             用来处理异常的代码,只有try代码块中的代码出现了异常，
             该代码块的代码才有可能(抛出的异常类型和捕获的异常类型一致时)会执行。

     小结：
     1. 捕获异常的格式
         try{
            // 编写可能会出现异常的代码
         } catch(异常类名 变量名){
             // 处理异常的代码
         }
 */
public class Demo031 {

    public static void main(String[] args) {

        System.out.println(div(0));

    }

    // 手动处理：捕获异常
    public static int div(int num ){

        int result = 0;

        /*  捕获异常格式
            try{

            } catch(异常类名 变量名){

            }
         */
        try {
            /*
            JVM检测到num为0时内部会执行如下代码：
                1. ArithmeticException e = new ArithmeticException("/ by zero");
                2. 将异常对象e抛给了方法调用者：throw e;
            */
            result = 100/num;//num = 0 就不会执行下面的代码 从定义完全可以看到如果继续执行下去 肯定会报错，但是由于这里num已经报错 跳转到catch了 下面代码没有机会执行
            // 定义字符串
            String str = null;
            /*
            JVM检测到str为null时内部会执行如下代码：
                1. NullPointerException e = new NullPointerException();
                2. 将异常对象e抛给了方法调用者
            */
            System.out.println(str.length());
        }catch (ArithmeticException e){  //异常就会进入catch处理 不会终止程序。
            System.out.println("除数不能为0！");
        }

        System.out.println("come here");
        return result;

    }


}
