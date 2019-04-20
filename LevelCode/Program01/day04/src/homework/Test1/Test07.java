package homework.Test1;

import java.util.*;

/**
     HashMap存储键是自定义对象值是String

     每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，则将学生对象和家庭住址存储到map集合
     中。学生作为键, 家庭住址作为值，并使用keySet和entrySet方式遍历Map集合.注意，学生姓名相同并且年龄相
     同视为同一名学生

     1. 定义学生类.包含姓名和年龄属性, 重写hashCode和equals方法
     2. 创建HashMap key保存学生对象,value是学生家庭住址
     3. 添加一批学生到HashMap中
     4. 使用keySet方式遍历Map
     5. 使用entrySet方式遍历Map
 */
public class Test07 {

    public static void main(String[] args) {

        HashMap<Student2,String> map = new HashMap<>();

        Student2 p1 = new Student2("马云", 46);
        Student2 p2 = new Student2("马化腾", 42);
        Student2 p3 = new Student2("马冬梅", 22);
        Student2 p4 = new Student2("马赛克", 18);
        Student2 p5 = new Student2("马赛克", 18);

        map.put(p1, "杭州");
        map.put(p2, "深圳");
        map.put(p3, "北京");
        map.put(p4, "东京");
        map.put(p5, "西安");

        Set<Student2> set = map.keySet();
        for (Student2 stu : set) {

            String value = map.get(stu);
            System.out.println(stu+"-"+value);

        }

        System.out.println("------------entrySet-------------");

        Set<Map.Entry<Student2, String>> entrySet = map.entrySet();
        for (Map.Entry<Student2, String> stuEntry : entrySet) {

            Student2 stu = stuEntry.getKey();
            String value = stuEntry.getValue();
            System.out.println(stu+"-"+value);

        }

        System.out.println("------------entrySet:迭代器-------------");
        Iterator<Map.Entry<Student2, String>> it = entrySet.iterator();
        while (it.hasNext()){

            Map.Entry<Student2, String> en = it.next();
            System.out.println(en.getKey()+"-"+en.getValue());

        }

    }

}

class Student2{

    private String name;
    private double age;

    public Student2() {
    }

    public Student2(String name, double age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return Double.compare(student2.age, age) == 0 &&
                Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name +"-"+ age;
    }
}
