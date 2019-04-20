package basecode._05finally代码块;
/**
 目标：能够说出finally代码的特点和作用

     讲解：
         1. finally代码块的格式
             try{

             } catch(异常类名 变量名){

             } finally{

             }
             或
             try{

             } finally{

             }
         2. finally代码的的特点
            只要代码执行流程进入的try代码块，不管是否出现异常，该代码块的代码都会执行的

         3. finally代码的的作用
            一般用来执行释放资源的代码(关闭IO流，释放数据库资源)

     小结：
         1. finally代码的特点和作用
             * 只要代码执行流程进入的try代码块，不管是否出现异常，该代码块的代码都会执行的
             * 用来执行释放资源的代码
 */
public class Demo05 {

    public static void main(String[] args){
        System.out.println(div(0));
    }

    public static int div(int num){
        int result = 0;
        if (result != 0){ //如果不符合if条件 finally是肯定不会执行的 因为都没有进入到try执行代码
            try{
                result = 100/num;
                System.out.println("result = " + result);
                return result;
            }  catch (Exception e){
                System.out.println("11111");
            } finally {
                System.out.println("执行了吗"); //只要进入到try代码执行 finally是肯定会执行的
            }
        }
        return result;
    }

}
