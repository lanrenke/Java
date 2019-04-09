package code._02封装的步骤和操作;

/**
 目标： 封装的步骤和操作。

 封装：是面向对象的三大特征之一（封装，继承，多态）。
      封装是代码的规范：认为成员变量应该隐藏，提供成套的getter和setter方法暴露成员变量的取值和赋值。

 封装的步骤：
     （1）先把成员变量使用private修饰进行隐藏（私有）。
         -- private修饰的成员只能在当前本类中直接访问。
         -- public修饰的成员可以在任何地方直接访问。

     （2）为每个隐藏的成员变量提供成套的getter和setter方法进行暴露取值和赋值。
         getter:获取成员变量的值，命名规范是：get+成员变量首字母大写
         setter:给成员变量赋值，  命名规范是：set+成员变量首字母大写

 小结：
    按照规范：成员变量应该隐藏，提供成套的getter和setter方法暴露成员变量的取值和赋值。
    注意：成员变量隐藏和提供方法暴露已经是Java代码书写的标准，即使毫无意义你也要这样写。

 */
public class TestStudent01 {

    public static void main(String[] args) {

        Student yuYang = new Student();
        yuYang.setName("余洋");
       // yuYang.setName(); = -1000; // 这里的数据出现业务问题，因为age已经超过限定范围 会报错。
        yuYang.setAge(17);
        System.out.println(yuYang.getName());
        System.out.println(yuYang.getAge());

    }

}
