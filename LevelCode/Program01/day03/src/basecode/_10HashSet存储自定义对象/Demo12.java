package basecode._10HashSet存储自定义对象;

import java.util.HashSet;

/**
 目标：能够使用HashSet存储自定义对象并实现去重功能。

     讲解：
         1.定义一个学生类，包含姓名和年龄两个成员变量。
         2.在测试类中创建多个学生对象存储到HashSet集合中
         3.要求相同姓名和年龄的学生对象只存储一个。

     小结：
         1. 如何实现HashSet存储自定义对象实现去重功能？
         定义类需要重写hashCode和equals方法
 */
public class Demo12 {

    public static void main(String[] args) {

        HashSet<Student> stuSet = new HashSet<>();
        // 添加学生对象
        stuSet.add(new Student("lucy",19));
        stuSet.add(new Student("lily",20));
        stuSet.add(new Student("老王",28));

        stuSet.add(new Student("老王吧",38));
        stuSet.add(new Student("老王吧",38)); //如果没有重写方法 这里就会出先重复。会有两个相同的内容
                                                        //new出来的内容 地址值是肯定不同的。

        for (Student student : stuSet) {
            System.out.println(student);
        }

    }

}
