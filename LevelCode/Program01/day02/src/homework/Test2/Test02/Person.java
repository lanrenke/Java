package homework.Test2.Test02;
/**
 ⾃定义⼈类:包含姓名,年龄,身⾼属性.私有成员变量,⽣成⽆参,有参构造⽅法,⽣成get/set⽅法
 */
public class Person {

    private String name;
    private int age;
    private double height;

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
