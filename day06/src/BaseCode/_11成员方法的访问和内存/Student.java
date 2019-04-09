package BaseCode._11成员方法的访问和内存;
/**
    目标：成员方法的访问和内存

    成员方法的分类：
        实例方法：无static修饰，属于对象，必须先创建对象，然后用对象来访问实例方法。
        静态方法：有static修饰，属于类，直接用类名进行访问。

    方法的访问语法规则：
        实例方法：
            对象.实例方法
        静态方法：
            类名.静态方法
            对象.静态方法（不推荐）

 */
public class Student {
    public String name ;

    // 实例方法
    public void study(){
        System.out.println(name + "在认真学习！！");
    }

    // 静态方法
    public static void inAddr(){
        System.out.println("我们都在黑马的210听Dlei吹水！");
    }

    public static void main(String[] args) {
        /** 静态方法的访问 */
        // 类名.静态方法
        Student.inAddr();
        // 同一个类中访问静态方法可以省略类名不写！
        inAddr();

        /** 实例方法的访问  */
        // Student.study(); // 报错，实例方法不能用类名访问，属于对象的方法。
        Student stu = new Student();
        stu.name = "迪丽热巴";
        // 对象.实例方法
        stu.study();

        /** 对象.静态方法（不推荐） */
        stu.inAddr();
    }
}
