package BaseCode._07构造器_无参构造器初始化对象的默认值;
/**
    目标：无参构造器初始化对象成员变量的默认值
     规则：
     - 所有的数值类型的默认是0或者0.0，整形是0 ，浮点型是0.0
     - 布尔类型的默认值是false
     - char类型的默认值的编号是0
     - 引用类型的默认值是null
     小结：
        1.成员变量可以有默认值。
        2.无参数构造器只能把对象的数据初始化成默认值。
 */
public class Student {
    // 定义5个学生的属性信息： 修饰符 数据类型 变量名称 = 初始值;
    public String name ; // 姓名
    public int age ; // 年龄
    public char sex ; // 性别
    public double height ; // 身高
    public double weight = 60.0 ; // 体重
    public boolean one = false;  // 是否单身 true , false

    // 无参数构造器

    public static void main(String[] args) {
        Student mjj = new Student();
        System.out.println(mjj.name);
        System.out.println(mjj.age);
        System.out.println(mjj.sex);
        System.out.println(mjj.height);
        System.out.println(mjj.weight);
        System.out.println(mjj.one);
    }

}
