package BaseCode._03成员变量的定义详解;
/**
    目标：成员变的定义量详解

    属于类的成分之一。
    成员变量的作用：用来描述属性信息的。

    成员变量的定义格式：
        修饰符 数据类型 变量名称 = 初始值;
    格式注意事项：
         1.修饰符：public|private|protected|缺省，static,final,transient; 暂时都用public
         2.数据类型：基本数据类型，引用数据类型。
         3.变量名称：必须是合法的标识符，首字母应该小写，满足"驼峰模式"，一般是名词（属性名称）。
         4.初始值：可有可无，成员变量的初始值在定义的时候可以不给初始值。初始值数据的类型必须满足要求

    小结：
        开发中具体定义多少成员变量，是由业务需求决定的，业务关心什么信息就定义什么属性。
        成员变量的初始值是可有可无的（通常是不需要给初始值的）
 */
public class Student {
    // 定义5个学生的属性信息： 修饰符 数据类型 变量名称 = 初始值;
    public String name ; // 姓名
    public int age ; // 年龄
    public char sex ; // 性别
    public double height ; // 身高
    public double weight = 60.0 ; // 体重
    public boolean one = false;  // 是否单身 true , false
}
