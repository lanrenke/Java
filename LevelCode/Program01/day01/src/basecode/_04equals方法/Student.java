package basecode._04equals方法;


import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写父类方法：通过比较两个对象的内容判断对象是否相同
    /*@Override
    public boolean equals(Object obj) {
        // 判断obj是否是this
        if(obj == this) return true;

        if (obj == null) return false;

        // 判断obj是否是当前类的对象
        if (!(obj instanceof Student)){
            return false;
        }

        // this：s1
        // obj: s2
        // 对obj进行向下转型
        Student s2 = (Student) obj;
        // 判断姓名是否相同
        if(!this.name.equals(s2.name)){
            return false;
        }

        // 判断年龄是否相同
        if (this.age != s2.age){
            return false;
        }
        // 来到这里说明姓名和年龄都相同
        return true;
    }*/

    //这里是ide工具生成从方法，和上面注释的代码的功能是一致的，但是更加简洁。
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//如果传入的参数是调用函数自身，直接返回true
        if (o == null || getClass() != o.getClass()) return false;//如果传入参数为空 或者 传入的参数(对象)不是当前类 直接返回false

        Student student = (Student) o; //因为传入的为 多态父类 需要强制转换成子类。
        return age == student.age &&
                Objects.equals(name, student.name);//这里使用了Objects工具类，用来相应字符串的内容是否相同。
    }

}
