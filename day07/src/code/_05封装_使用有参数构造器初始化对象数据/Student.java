package code._05封装_使用有参数构造器初始化对象数据;

public class Student {

    // 定义5个学生的属性信息： 修饰符 数据类型 变量名称 = 初始值;
    private String name ; // 姓名
    private int age ; // 年龄
    private char sex ; // 性别
    private double height ; // 身高

    // 无参数构造器
    public Student() {
    }

    // 有参数构造器
    public Student(String name, int age, char sex, double height) {
        System.out.println("有参数构造器");
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
