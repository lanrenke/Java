package BaseCode._12两个对象内存图;
/**
    目标：两个对象内存图
 */
public class Student {
    // 实例变量
    public String name ;
    public int age ;
    // 静态成员变量
    public static String schoolName = "黑马";

    // 实例方法
    public void sing(){
        System.out.println(name + ",已经" + age  +"岁，正在快乐的歌唱！！");
    }
    // 静态方法
    public static void inAddr(){
        System.out.println("我们都在吉山区快乐的学习!");
    }


    public static void main(String[] args) {
        /** 访问静态 */
        System.out.println(Student.schoolName); // 黑马
        System.out.println(schoolName); // 黑马
        Student.inAddr();
        inAddr();

        /** 访问实例 */
        // 创建类的对象:
        // 类名  对象名称 = new 构造器;
        Student mjj = new Student();
        mjj.name = "马俊杰";
        mjj.age  = 21 ;
        System.out.println(mjj.name); //  马俊杰
        System.out.println(mjj.age);  //  21
        mjj.sing(); // 马俊杰,已经21岁，正在快乐的歌唱！！

        Student xzq = new Student();
        xzq.name = "许梓强";
        xzq.age  = 22 ;
        System.out.println(xzq.name); // 许梓强
        System.out.println(xzq.age);  // 22
        xzq.sing(); // 许梓强,已经22岁，正在快乐的歌唱！！


        /** 访问静态：对象访问静态不推荐 */
        mjj.inAddr();
        xzq.inAddr();
        System.out.println(mjj.schoolName);
        System.out.println(xzq.schoolName);
    }
}
