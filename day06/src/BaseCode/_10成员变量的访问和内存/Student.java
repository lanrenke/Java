package BaseCode._10成员变量的访问和内存;
/**
    目标：成员变量的访问和内存机制。

    成员变量的分类：
        静态成员变量：有static修饰，属于类，用类名访问即可，只有一份。
        实例成员变量：无static修饰，属于对象，必须用对象访问，属于每个对象的。

    成员变量的访问语法：
        静态成员变量：
            类名.静态成员变量
            对象.静态成员变量（不推荐）

        实例成员变量：
            对象.实例成员变量。
    小结：
        静态成员可以被类的所有对象共享
        语法上支持用对象来访问静态成员变量，但是不推荐，完全没有必要用对象访问静态成员直接用类名访问即可！
 */
public class Student {
    // 实例成员变量：无static修饰，属于对象，必须用对象访问，属于每个对象的。
    public String name ;
    private int age ;

    // 静态成员变量：有static修饰，属于类，用类名访问即可，只有一份。
    public static String schoolName = "传智";

    public static void main(String[] args) {
        /**  静态成员变量访问。*/
        //  1.类名.静态成员变量
        System.out.println(Student.schoolName);
        //  注意：静态成员变量在同一个类中访问可以省略类名不写！！
        System.out.println(schoolName);

        /** 实例成员变量：访问 */
        // System.out.println(Student.name); // 报错!
        Student mjj = new Student();
        // 2.对象.实例成员变量。
        mjj.name = "马俊杰";
        mjj.age = 18;
        System.out.println(mjj.name);
        System.out.println(mjj.age);

        // 3.对象.静态成员变量
        System.out.println(mjj.schoolName);

    }
}
