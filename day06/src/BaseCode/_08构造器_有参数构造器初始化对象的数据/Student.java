package BaseCode._08构造器_有参数构造器初始化对象的数据;
/**
    目标：有参数构造器初始化对象的数据

    小结：
        无参数构造器只能初始化对象的数据成为默认值。
        有参数构造器可以在初始化对象的时候同时为对象的数据赋值。
 */
public class Student {
    // 定义5个学生的属性信息： 修饰符 数据类型 变量名称 = 初始值;
    public String name ; // 姓名
    public int age ; // 年龄
    public char sex ; // 性别
    public double height ; // 身高

    // 无参数构造器
    public Student(){
        System.out.println("无参数构造器");
    }

    // 有参数构造器
    public Student(String name1 , int age1 , char sex1 , double height1){
            System.out.println("有参数构造器");
            name = name1 ;
            age = age1 ;
            sex = sex1 ;
            height = height1;
    }

    public static void main(String[] args) {
        // 无参数构造器
        Student mjj = new Student();
        mjj.name = "马俊杰";
        mjj.age = 18;
        mjj.sex = '男';
        mjj.height = 180;
        System.out.println(mjj.name);
        System.out.println(mjj.age);
        System.out.println(mjj.sex);
        System.out.println(mjj.height);

        // 有参数构造器:帮助初始化对象的数据！
        Student mjj1 = new Student("马俊杰1" , 18 , '男',180);
        System.out.println(mjj1.name);
        System.out.println(mjj1.age);
        System.out.println(mjj1.sex);
        System.out.println(mjj1.height);

    }

}
