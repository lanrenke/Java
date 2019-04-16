package basecode._11StringBuilder类;
/**
 目标：掌握StringBuilder类的常用方法

 讲解：
     StringBuilder是什么
         * 一个可变的字符序列：可变的字符串
         * String类是不可变的字符串

     为什么使用StringBuilder
         * 解决String字符串拼接耗性能问题：耗内存和耗时间

     StringBuilder的构造方法
         * StringBuilder(); 创建可变的字符串，底层默认数组长度16,且会自动扩容。
         * StringBuilder(String str); 将不可变字符串转换为可变字符串，就是将对应字符串放到了可变字符串(数组)中


     StringBuilder类常用方法
         * StringBuilder append(数据类型 变量)
            * 追加内容
         * String toString();
            * 将可变字符串转换为不可变字符串

 小结：
     StringBuilder类常用方法
         append
         toString

     StringBuilder和String类的选择
         如果需要进行大量的字符串拼接操作则强烈推荐选择StringBuilder
         如果不需要做拼接操作，则选择String
 */
public class Demo121 {

    public static void main(String[] args) {

        // 创建可变字符串
        StringBuilder sb = new StringBuilder();

        // 追加内容
        /* sb.append("hello");
        sb.append(123);
        sb.append(true);
        sb.append(1.5);*/

        //链式编程：当一个方法的返回值是一个对象时，可以继续调用该对象的方法
        sb.append("hello").append(123).append(true).append(1.5);

        /**
            String toString();
              将可变字符串转换为不可变字符串
         */
        String result = sb.toString();
        System.out.println(result);
        System.out.println(sb);

    }

}
