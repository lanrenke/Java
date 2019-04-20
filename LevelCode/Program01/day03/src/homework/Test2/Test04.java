package homework.Test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
     HashSet
     定义一个Student类,包含名称,年龄,性别(姓名,年龄,性别完全相同视为同一学生)
     创建10个Student对象,至少有两个学生姓名,年龄,性别完全相同. 把这10个学生添加到Set集合中,不可以重复,遍历
     Set集合打印学生信息,使用两种方式

     1. 定义一个Student类,包含名称,年龄,性别重写hashCode()和equals()方法
     2. 创建HashSet集合
     3. 使用Student类创建10个学生,把这10个学生添加到Set集合中
     4. 使用迭代器遍历HashSet
     5. 使用增强for遍历集合
 */
public class Test04 {

    public static void main(String[] args) {

        HashSet<Student> stuSet = new HashSet<>();
        stuSet.add(new Student("张三", 18, "男"));
        stuSet.add(new Student("小王", 16, "女"));
        stuSet.add(new Student("倩倩", 19, "女"));
        stuSet.add(new Student("张伟", 18, "男"));
        stuSet.add(new Student("张三", 18, "男"));
        stuSet.add(new Student("老王", 38, "男"));
        stuSet.add(new Student("张三", 18, "男"));
        stuSet.add(new Student("小刘", 20, "女"));
        stuSet.add(new Student("张三", 18, "男"));
        stuSet.add(new Student("天二", 21, "男"));

        System.out.println("迭代器");
        Iterator<Student> it = stuSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("增强for");
        for (Student student : stuSet) {
            System.out.println(student);
        }


    }

}

class Student{

    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, sex);
    }

}