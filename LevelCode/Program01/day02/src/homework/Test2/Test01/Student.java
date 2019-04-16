package homework.Test2.Test01;
/**
 ⾃定义学⽣类:包含姓名,年龄,成绩属性.私有成员变量,⽣成⽆参,有参构造⽅法,⽣成get/set⽅法
 */
public class Student {

    private String name;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
