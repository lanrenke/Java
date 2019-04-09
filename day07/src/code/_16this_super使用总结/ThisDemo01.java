package code._16this_super使用总结;
/**
 目标：this , super

 this：代表当前本类对象
 super:代表父类对象引用。

 this用在本类中可以访问本类的成员：
     this.本类成员变量。
     this.本类成员方法。
     this(...):在本类构造器中访问本类其他构造器。还没有学习！
 super用在本类中访问父类的成员:
     super.父类成员变量。
     super.父类成员方法。
     super(...):在本类构造器中访问父类其他构造器。

 目标：this(...):在本类构造器中访问本类其他构造器

 小结：
     this(...)在本类构造器中根据参数匹配调用本类中其他构造器。
     this的目的在于借用本类兄弟构造器的功能。
     注意：this(...)调用构造器必须写在代码第一行。
     注意:super(...)和this(...)不能同时出现在构造器中，因为都要在第一行。
 */
public class ThisDemo01 {

    public static void main(String[] args) {

        Student student1 = new Student("张三",18,"黑马");
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getSchoolName());
        System.out.println("-------------------------");

        Student student2 = new Student("李四",18);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getSchoolName());

    }

}

class Student{

    private String name;
    private int age;
    private String schoolName;

    public Student() {
    }

    public Student(String name, int age) {

        //通过this方法来达到调用其它构造器的作用
        this(name,age,"传智");

    }

    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}