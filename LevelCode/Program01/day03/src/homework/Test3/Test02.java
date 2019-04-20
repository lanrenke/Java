package homework.Test3;

import java.util.HashSet;
import java.util.Objects;

/**
     1. HashSet
     2. 增强for

     一个学科中有若干班级，每一个班级又有若干学生。整个学科一个大集合，若干个班级分为每一个小集合(集合嵌
     套之HashSet嵌套HashSet)。要求如下
     1、 学生类有两个属性，姓名和年龄，并定义有参构造、无参构造和getter/setter方法.姓名和年龄相同的视为同一学生
     2、向班级集合中添加若干个学生（至少两个学生）。
     2、向学科集合中添加所有班级(至少创建两个班级)。
     3、使用两种方法遍历学科集合，并打印出所有学生。
 */
public class Test02 {

    public static void main(String[] args) {

        //班级1
        HashSet<Student> class1 = new HashSet<>();
        class1.add(new Student("zhangsan", 20));
        class1.add(new Student("lisi", 25));
        class1.add(new Student("lisi", 25));

        //班级2
        HashSet<Student> class2 = new HashSet<Student>();
        class2.add(new Student("wanwu", 23));
        class2.add(new Student("zhaoli", 27));

        HashSet<HashSet<Student>> subject = new HashSet<>();
        subject.add(class1);
        subject.add(class2);

        for (HashSet<Student> stuClass : subject) {
            for (Student student : stuClass) {
                System.out.println(student);
            }
        }

    }

}
class Student{

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

}