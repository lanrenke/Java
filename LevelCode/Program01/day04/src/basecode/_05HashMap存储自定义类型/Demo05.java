package basecode._05HashMap存储自定义类型;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 目标：使用HashMap存储自定义对象：自定义对象作为键使用

     需求说明：
         每位学生（姓名，年龄）都有自己的家庭住址。那么既然有对应关系，
         则将学生对象和家庭住址存储到map集合中。学生作为键，家庭住址作为值。
         注意，学生姓名相同并且年龄相同视为同一名学生。

         步骤分析：
             1. 创建学生类Student：name和age
             2. 创建一个Map集合：Map<Student,String>
             3. 创建多个学生对象添加到Map集合中
             4. 遍历输出Map集合数据

     小结:
         使用自定义对象作为键时如何实现去重功能
         自定义对象需要重写hashCode和equals方法
 */
public class Demo05 {

    public static void main(String[] args) {

        // 2. 创建一个Map集合：Map<Student,String>
        Map<Student,String> map = new HashMap<>();
        // 3. 创建多个学生对象添加到Map集合中
        map.put(new Student("小武",20), "广州"); 
        map.put(new Student("小王",22), "深圳"); 
        map.put(new Student("小泽",30), "东莞"); 
        map.put(new Student("小武",20), "珠海");

        Set<Student> keySet = map.keySet();
        for (Student stu : keySet) {
            System.out.println(stu);
            System.out.println(map.get(stu));
        }

    }

}
