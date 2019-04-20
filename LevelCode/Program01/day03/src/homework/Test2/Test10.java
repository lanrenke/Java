package homework.Test2;

import java.util.HashSet;

/**
     HashSet
     自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.创建5个学生放到
     HashSet中(姓名和年龄相同的认为是同一学生).使用迭代器获取每个学生信息.统计总分,平均分,最高分,最低分并输出

     1. 创建HashSet,用于存放学生
     2. 使用add方法添加5个学生
     3. 使用迭代器获取一个学生.
     4. 定义总分变量
     5. 定义最高分变量,初始化值为迭代出来的学生的成绩
     6. 定义最低分变量,初始化值为迭代出来的学生的成绩
     7. 使用增强for循环获取遍历HashSet,获取到每个学生
     8. 在增强for中将学生的分数添加到总分
     9. 在增强for中判断最高分是否小于这个学生的分数,如果最高分小于这个学生的分数,将这个学生的分数设置为最
     高分
     10. 在增强for中判断最低分是否大于这个学生的分数,如果最低分大于这个学生的分数,将这个学生的分数设置为最
     低分
     11. 计算平均分(平均分 = 总分 / 人数)12. 按照格式打印
 */
public class Test10 {

    public static void main(String[] args) {

        HashSet<Student2> stuSet = new HashSet<>();

        stuSet.add(new Student2("王昭君", 21, 99));
        stuSet.add(new Student2("西施", 21, 88));
        stuSet.add(new Student2("杨玉环", 20, 77));
        stuSet.add(new Student2("貂蝉", 19, 66));
        stuSet.add(new Student2("貂蝉", 19, 89));
        stuSet.add(new Student2("貂蝉", 18, 89));

        //统计总分
        double count = 0;
        //最高分
        double max = stuSet.iterator().next().getScroe();//通过迭代器才能获取到对象才能get到对应数据 现在只要第一个数据
        //最低分
        double min = stuSet.iterator().next().getScroe();

        for (Student2 student2 : stuSet) {

            count += student2.getScroe();
            if (max < student2.getScroe()){
                max = student2.getScroe();
            }
            if (min > student2.getScroe()){
                min = student2.getScroe();
            }

        }
        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
        System.out.println(count/stuSet.size());


    }

}

class Student2{

    private String name;
    private int age;
    private double scroe;

    public Student2() {
    }

    public Student2(String name, int age, double scroe) {
        this.name = name;
        this.age = age;
        this.scroe = scroe;
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

    public double getScroe() {
        return scroe;
    }

    public void setScroe(double scroe) {
        this.scroe = scroe;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scroe=" + scroe +
                '}';
    }
}
