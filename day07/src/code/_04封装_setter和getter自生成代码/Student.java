package code._04封装_setter和getter自生成代码;

public class Student {

    private String name ;
    private int age;
    private String email ;
    private char sex ;

    // 2.自动生成setter和getter方法
    // 右键 -> Generate -> Getter and Setter
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
