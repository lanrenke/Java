package homework.Test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
     HashMap存储键是String 值是自定义对象

     每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，则将学生对象和家庭住址存储到Map集合中。
     家庭住址作为键, 学生作为值。并使用keySet和entrySet方式遍历Map集合

     1. 定义学生类.包含姓名和年龄属性
     2. 创建HashMapkey保存学生家庭住址,value是学生对象
     3. 添加一批学生到HashMap中
     4. 使用keySet方式遍历Map
     5. 使用entrySet方式遍历Map
 */
public class Test06 {

    public static void main(String[] args) {

        HashMap<String,Student> map = new HashMap<>();

        Student p1 = new Student("马云", 46);
        Student p2 = new Student("马化腾", 42);
        Student p3 = new Student("马冬梅", 22);
        Student p4 = new Student("马赛克", 18);

        map.put("杭州", p1);
        map.put("深圳", p2);
        map.put("北京", p3);
        map.put("东京", p4);

        Set<String> set = map.keySet();
        for (String str : set) {

            Student stu = map.get(str);
            System.out.println(str+"-"+stu.getName()+"-"+stu.getAge());

        }

        System.out.println("------------entrySet-------------");
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {

            String address = entry.getKey();
            Student stu = entry.getValue();
            System.out.println(address+"-"+stu.getName()+"-"+stu.getAge());

        }

    }

}
class Student{

    private String name;
    private double age;

    public Student() {
    }

    public Student(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
