package code.Base01.Base02;
/**
 目标：变量的概念和定义格式。

 什么是变量？
 变量是内存中的一块区域，其存储的值在一定范围内可以改变的量称为变量。
 开发中，很多数据是经常需要被修改，传输等的，这时候都要用变量。
 完成可以把变量理解成一个瓶子，只能装一个特定类型的数据。

 如何定义变量？
 变量的定义格式：
 数据类型 变量名称 = 初始值;
 1.变量需要确定自己到底存储什么类型的数据，此时要使用数据类型约束
 -- 下节课讲解数据类型有哪些。
 2.变量名称：首字母建议小写，满足“驼峰模式”  className  age   studentName
 3.初始值：必须与变量的数据类型保持一致。
 小结：
 记住格式!

 */
public class VariableDemo01 {
    public static void main(String[] args) {

        // 定义一个变量存储一个人的年龄
        // 数据类型 变量名称 = 初始值;
        int age = 21;
        System.out.println(age); // 21
        age = 22 ; // =是赋值
        System.out.println(age); // 22

    }
}
