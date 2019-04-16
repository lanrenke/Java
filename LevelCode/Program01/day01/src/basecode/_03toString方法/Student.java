package basecode._03toString方法;

public class Student {

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

    /* @Override //手动重写的方法，如果成员变量过多的话书写非常麻烦。
    public String toString() {
        return this.name + " ：" + this.age;
    }*/

    //使用IDE生成的重写toString方法 有多少个变量都不怕 都会自动生成
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
