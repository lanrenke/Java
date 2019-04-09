package code._11ArrayList存储基本数据类型;
import java.util.ArrayList;

/**
    目标：自定义4个学生对象,添加到集合,并遍历。
    开发中用的最多的形式。
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        // 创建一个集合对象用于存储4个学生对象。
        ArrayList<Student> allStus = new ArrayList<>();

        Student s1 = new Student("李万森",21,"112期");
        Student s2 = new Student("瞿亮",19,"112期");
        Student s3 = new Student("陈科",18,"112期");
        Student s4 = new Student("张小锋",17,"112期");

        allStus.add(s1);
        allStus.add(s2);
        allStus.add(s3);
        allStus.add(s4);

        for(Student stu : allStus){
            System.out.println(stu.getName()+"=>"+stu.getAge());
        }
    }
}

class Student{
    private String name ;
    private int age ;
    private String className ;

    public Student() {
    }

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


}
