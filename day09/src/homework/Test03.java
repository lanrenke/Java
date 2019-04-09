package homework;
/**
    学生都有年龄和姓名属性,有吃饭(学生餐)和学习方法,但是有部分学生会打篮球
    老师都有年龄和姓名属性,有吃饭(工作餐)和讲课方法,但是有部分老师会打篮球
    定义一个方法模拟去打篮球,只要会打篮球的人都可以传入. (提示通过在测试类中定义一个方法参数为接口)

     编写步骤
         1. 定义Person类
         2. Person类包含name,age属性和抽象的eat方法
         3. 定义Sport接口,包含playBasketball方法
         4. 定义Teacher类继承Person类,重写抽象方法eat()
         5. 定义SportTeacher类继承Teacher类,实现Sport接口,重写Sport接口中的playBasketball方法
         6. 定义Student类继承Person类,重写抽象方法eat()
         7. 定义SportStudent类继承Student类,实现Sport接口,重写Sport接口中的playBasketball方法
         8. 在测试类中定义静态的goToSport方法,参数为Sport接口类型
         9. 在main方法中创建普通的老师t1,姓名为马云,年龄为45岁
         10. 在main方法中创建会打篮球的老师t2,姓名为大姚,年龄为35岁
         11. 在main方法中创建普通的学生s1,姓名为小王,年龄为20
         12. 在main方法中创建会打篮球的学生s2,姓名为王中王,年龄为21
         13. 在main方法中调用goToSport方法.传入t1,t2,s1,s2四个对象.我们会发现只有实现Sport接口的对象才能传入

 */
public class Test03 {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("马云,",45);
        SportTeacher teacher2 = new SportTeacher("大姚",35);
        Student student1 = new Student("小王",20);
        SportStudent student2 = new SportStudent("王中王",21);

        //goToSport(teacher1);只有实现Sport接口的对象才能传入
        goToSport(teacher2);
        //goToSport(student1);只有实现Sport接口的对象才能传入
        goToSport(student2);

    }

    public static void goToSport(Sport sport){
        sport.playBasketball();
    }

}

class Teacher extends Person{

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("工作餐");
    }

}

class SportTeacher extends Teacher implements Sport{

    public SportTeacher() {
    }

    public SportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+"岁 "+getName()+" 老师在打篮球");
    }

}

class Student extends Person{

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("学生餐");
    }

}

class SportStudent extends Student implements Sport{

    public SportStudent() {
    }

    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+"岁 "+getName()+" 学生在打篮球");
    }

}

abstract class Person{

    private String name;
    private int age;
    public abstract void eat();

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

}


interface Sport{
    void playBasketball();
}