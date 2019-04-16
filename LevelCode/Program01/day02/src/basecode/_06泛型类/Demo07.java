package basecode._06泛型类;
/**
     目标：能够定义和使用泛型类

     讲解：
         1. 泛型概述
             * 概念：数据类型参数化，JDK1.5新特性
             * 泛型常用于类上，方法上，接口上
             * 泛型变量命名规则：只要是一个合法的标识符就可以，一般使用一个大写字母表示
             * 常用的字母：T type, E element, K key, V value
             * 泛型变量可以理解为是一种数据类型的占位符。

         2. 泛型类概念
             * 在定义类时使用了泛型变量的类则称为泛型类

         3. 泛型类定义格式
             * class 类名<泛型变量>{}

         4. 泛型类使用注意事项
             * 泛型变量的具体数据类型由使用者创建泛型类对象时指定
             * 如果没有指定泛型变量的具体数据类型则默认是Object

     小结：
         1. 泛型类定义格式
             class 类名<T>{
                在类中可以将T当成一种数据类型使用
             }

         2. 如何使用泛型类
             1. 创建对象时指定泛型变量的具体数据类型
             类名<String> 变量名 = new 类名<>();
 */
public class Demo07 {

    public static void main(String[] args) {

        // 创建数组
        String[] strs  = {"a","b","c"};
        Integer[] ins = {1,2,3};//注意要使用包装类

        // 创建数组工具类对象：指定泛型变量为String
        MyArrays<String> arr01 = new MyArrays<>();//创建对象的时候需要定义是什么类型。
        arr01.reverse(strs);

        // 创建数组工具类对象：指定泛型变量为Integer
        MyArrays<Integer> arr02 = new MyArrays<>();
        arr02.reverse(ins);

        MyArrays  arrays03 = new MyArrays();//如果没有定义泛型 会默认为Object

    }

}
