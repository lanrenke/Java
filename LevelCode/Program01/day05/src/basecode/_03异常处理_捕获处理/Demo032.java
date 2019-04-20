package basecode._03异常处理_捕获处理;
/**
 目标：能够捕获多种类型的异常

     讲解：
         1. 多catch捕获异常的格式
             try{

             } catch(异常类型 变量名){

             }....catch(异常类型 变量名){

             }

         2. 多catch捕获异常的注意事项
             多个catch中的异常类型之间有继承关系，则父类类型的异常要放在子类后面，
             如果没有继承关系则没有顺序之分。

         3. try代码块中有没有可能同时出现两个异常？ catch代码块有没可能同时执行两个？
            * 不可能：当出一个异常 try里的代码只能执行到出现到异常那一段代码 不会继续执行 是肯定不可能有两个异常的
     小结：
     1. 多catch捕获异常的格式
         try{

         } catch(异常类型 变量名){

         }....catch(异常类型 变量名){

         }

 */
public class Demo032 {
    public static void main(String[] args){
        System.out.println(div(0));
    }

    public static int div(int num){
        int result = 0;
        try{
            /*
            JVM检测到num为0时内部会执行如下代码：
                1. ArithmeticException e = new ArithmeticException("/ by zero");
                2. 将异常对象e抛给了方法调用者
            */
            result = 100/num;
            // 定义字符串
            String str = "abc";
            /*  当str=null时，会出现空指针异常：
                1. NullPointerException e = new NullPointerException();
                2. 将异常对象e抛给了方法调用者
             */
            System.out.println(str.length()); // 3
            /*
                当字符串索引越界时：
                1. StringIndexOutOfBoundsException e = new StringIndexOutOfBoundsException("String index out of range: 3");
                2. 将异常对象e抛给了方法调用者
             */
            System.out.println(str.charAt(3));

            // 定义数组
            int[] arr = {1,2};
            System.out.println(arr[2]); // ArrayIndexOutOfBoundsException

        }  catch (StringIndexOutOfBoundsException e){
            System.out.println("33333");
        }  catch(ArithmeticException e){
            System.out.println("11111");
        }  catch (NullPointerException e){ // e = new NullPointerException();
            System.out.println("22222");
        }  catch (Exception e){ // e = new ArrayIndexOutOfBoundsException();
            System.out.println("44444");
        }
        System.out.println("come here");
        return result;
    }

}
