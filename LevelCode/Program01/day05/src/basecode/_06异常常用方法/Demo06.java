package basecode._06异常常用方法;
/**
 目标：掌握异常中常用的方法

     讲解：
         public void printStackTrace();
         追踪栈异常信息来源
         打印异常栈信息

         public String getMessage();
         获得异常原因字符串

         public String toString();
         获得异常信息字符串：异常类全名：异常原因字符串

     小结：
         1. 异常中常用方法有哪3个
             String getMessage();
             String toString();
             void printStackTrace();
 */
public class Demo06 {

    public static void main(String[] args) {

        System.out.println(div(0));

    }

    public static int div(int num){
        int result = 0;

        try {
            result = 100 / num;
        }catch (ArithmeticException e){

            // 获得异常原因字符串
            System.out.println(e.getMessage());
            // 获得异常信息字符串：异常类全名：异常原因字符串
            System.out.println(e.toString());
            // 打印异常栈信息：实际开发中使用最多
            e.printStackTrace();

        }

        return result;
    }
}
