package basecode._04异常处理_声明和抛出;
/**
 目标：能够使用throw和throws关键字处理异常

     讲解：
         1. throw关键字的作用和格式
             作用：将异常对象抛给方法调用者并结束当前方法的运行。
             位置：使用在方法体中
             格式：throw new 异常类名("异常信息");

         2. throws关键字的作用和格式
             作用：将异常标识出来，报告给调用者该方法可能会出现的异常，让调用者注意处理。
             位置：使用在方法声明上
             格式：修饰符 返回值类型 方法名(参数列表) throws 异常类名,...{}

     小结：
         1. throw关键字的作用
             将异常对象抛给方法调用者并结束当前方法运行。
         2. throws关键字的作用
             将方法内部可能出的异常标识处理，告诉给方法调用者：让方法调用者注意处理异常。
 */
public class Demo04 {

    public static void main(String[] args) {

        try{
            System.out.println(div(0));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        //try...catch不会中断程序执行
        System.out.println("程序有运行到这里");

    }

    public static int div(int num) throws ArithmeticException,NullPointerException {//可以多个异常
        int result = 0;

        if(num == 0){
            throw new ArithmeticException("输入的除数不能为0！");
        }

        result = 100 / num;
        return result;

    }

}
