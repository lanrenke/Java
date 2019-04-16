package basecode._02Object类概述;
/**
 目标：能够说出Object类的特点

 讲解：
     1. Object类的特点
         * 类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
         * 每个类都直接或间接继承Object类

     2. Object类的常用方法
         * boolean equals(Object obj)
         * String toString()

 小结：
     1. Object类的特点:
        所有类的父类(基类，超类)
 */
public class Demo02 {

    public static void main(String[] args) {

        Demo02 d = new Demo02();
        d.toString();//在本类中并没有定义任何方法，可以调用方法的原因是因为已经默认继承了Object类。

    }

}
