package basecode._12可变参数;
/**
 目标：能够使用可变参数

     讲解：
         1. 可变参数引入：
            定义一个方法求2个整数之和

         2. 什么是可变参数
             JDK1.5新特性
             方法参数个数可以是任意个：0到n

         3. 可变参数的格式
            数据类型...变量名

         4. 可变参数的注意事项
            只能有一个可变参数且必须要出现在参数列表的最后

     小结：
         1. 可变参数格式
             数据类型...数组名

         2. 可变参数的本质
             数组

 */
public class Demo14 {

    public static void main(String[] args) {

        System.out.println(sum());//可以0个
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,4));

    }

    //使用可变参数就可以做到一个方法接受多给参数方法调用
    public static int sum(int...a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count += a[i];
        }
        return count;
    }

    /*//  定义一个方法求2个整数之和
    public static int sum(int a,int b){
        return  a + b;
    }

    // 定义一个方法求3个数之和
    public static int sum(int a,int b ,int c){
        return  a + b + c;
    }*/
}
