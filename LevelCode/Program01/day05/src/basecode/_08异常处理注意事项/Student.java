package basecode._08异常处理注意事项;

public class Student extends Person {

    @Override
    public void eat(){
        try{
            System.out.println("吃到沙子...");
        } catch(Exception e){

        }

        // 如果父类方法没有声明异常，则重写方法时内部出现了异常该如何处理？
        // 方式1：方法内部使用try...catch捕获异常
        // 方式2：在重写方法上声明运行时异常
    }
}
