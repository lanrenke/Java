package homework.Test1;

import java.util.HashSet;
import java.util.Objects;

/**
     HashSet存储自定义类型
     定义人类,包含姓名和年龄属性.创建4个人存储到HashSet中.姓名和年龄相同的人只存储一个。
     1. 定义Person类.包好姓名年龄属性,重写hashCode()和equals()方法
     2. 创建HashSet用于存储Person类型
     3. 添加多个Person到HashSet中
     4. 遍历获取HashSet中的内容
 */
public class Test06 {

    public static void main(String[] args) {

        HashSet<Person> personSet = new HashSet<>();
        personSet.add(new Person("Jack",20));
        personSet.add(new Person("Licy",15));
        personSet.add(new Person("Tom",18));
        personSet.add(new Person("Stn",14));

        for (Person person : personSet) {
            System.out.println(person);
        }

    }

}


class Person{

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

}