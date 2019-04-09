package code._08继承的案例演示;
/**
 目标：继承的案例演示

     比如我要开发一个教务系统:
     学生类（姓名，年龄，性别）
     老师类（姓名，年龄，性别）
     班主任（姓名，年龄，性别）

 解决方案：
     人类（姓名，年龄，性别）  父类
     学生类                 子类
     老师类                 子类
     班主任                 子类

 继承的格式：
     子类 extends 父类{

     }
 小结：
     继承的关系必须通过 子类 extends 父类来实现。
     继承后子类得到了父类的属性和行为。
     子类相同的东西放在父类，子类独有的还是放在子类中，
     一个父类可以有无数个子类。
     继承后代码的复用性确实提高了。所以继承很有必要！！
 */

public class TestMain {

    public static void main(String[] args) {

        // 创建学生对象
        Student s = new Student();
        s.setName("王秋冬");
        s.setAge(21);
        s.setSex('男');
        s.eat();
        s.study();
        System.out.println(s.getName());
        System.out.println(s.getSex());
        System.out.println(s.getAge());

    }

}
