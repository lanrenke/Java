package code.Base06;
/**
 方法调用的主要格式：方法名称(参数数据)

 有返回值方法的调用方式有且仅有三种:
     输出调用。
     赋值调用。
     直接调用。
 无反回值方法的调用方式有且仅有一种：
    直接调用。
 */
public class MethodDemo01 {

    public static void main(String[] args) {

        //输出调用
        System.out.println(sum(9,18));

        //赋值调用
        int c = sum(7,56);
        System.out.println(c);

        //直接调用 没有什么意义，丢弃了返回的值
        sum(8,5);

        System.out.println("-----------------");

        getSum(3,5);

    }

    public static int sum(int a,int b){

        return a + b;

    }

    //无反回值方法的调用方式有且仅有一种：
    public static void getSum(int a,int b){

        System.out.println(a+b);

    }

}
