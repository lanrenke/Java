package basecode._13自动拆装箱;

import java.util.ArrayList;

/**
     目标：能够说出自动装箱和自动拆箱的概念

     讲解：
         自动拆箱和自动装箱概述
             * JDK1.5新特性。

         什么是自动拆箱
             Java编译器自动将包装类类型的数据转换为对应的基本数据类型的过程
             Integer ==> int
             Double ==> double

         什么是自动装箱
             Java编译器自动将基本数据类型转换为对应的包装类类型的过程
             int ==> Integer
             double ==> Double

         装箱和拆箱演示
             装箱 int --> Integer
             拆箱 Integer --> int

         自动拆箱和自动装箱的好处
            * 包装类类型的数据可以直接和基本数据类型的数据进行运算。

         什么情况下会触发自动装箱和自动拆箱？
             * 当等号两边的数据类型不一致时就会触发(注意是这里的不一致是指两边都是同一种种类而不是同意类型时  如 int 与 Integer。像int 和 Double 就不是啦)
             * 左边是包装类类型，右边是基本数据类型：自动装箱
             * 左边是基本数据类型，右边是包装类型类型：自动拆箱

     小结
         1.什么是自动装箱：基本数据类型自动转换为包装类类型
         2.什么是自动拆箱：包装类类型自动转换为基本数据类型
 */
public class Demo14 {

    public static void main(String[] args){
        // 基本数据类型
        int num01 = 100;
        // 装箱：int --> Integer
        // JDK1.5之前的做法
        Integer num02 = Integer.valueOf(num01);
        // JDK1.5之后的做法
        // 反编译：查看源文件编译后的结果：xxx.class
        // javap -c -l -p  xxx.class
        Integer num03 = num01; // 自动装箱：Integer.valueOf(num01);

        int aa = num02; // 自动拆箱：num02.intValue();


        // 拆箱：Double --> double
        // 包装类型类型
        Double d01 = Double.parseDouble("200");
        // JDK1.5之前的做法
        double d02 = Double.valueOf(d01);
        // JDK1.5之后的做法
        double d03 = d01;


        int a = 100;
        Integer b = Integer.parseInt("200");
        Integer result = a + b; // Integer.valueOf(a + b.intValue());
        System.out.println(result);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);// list.add(Integer.valueOf(1));
        list.add(2);

        int num = list.get(0); // list.get(0).intValue();

    }

}
