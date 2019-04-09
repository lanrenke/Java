package code._08继承的案例演示;

public class People {

    private String name ;
    private int age ;
    private char sex ;

    public void eat(){
        System.out.println("吃饭");
    }

    public People() {
    }

    public People(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}
