package homework._抽象类;
/**
 语法点：封装，继承，抽象方法，抽象类
 请使用代码描述:
     2岁的红色的公鸡会吃饭(啄米)和打鸣
     1岁的黑色的鸭子会吃饭(吃鱼)和游泳
 开发提示：
     把公鸡和鸭子的共性内容(年龄属性,颜色属性,吃饭方法)抽取到家禽类中
     家禽类中定义抽象的吃饭方法
     公鸡继承家禽,重写吃饭方法,添加特有方法打鸣
     鸭子继承家禽,重写吃饭方法,添加特有方法游泳
 */
public class Test03 {

    public static void main(String[] args) {

        Chicken chicken = new Chicken(2,"红色");
        BlackDuck blackDuck = new BlackDuck(2,"黑色");
        System.out.println(chicken.getAge()+"岁的"+chicken.getColor()+"的公鸡会"+chicken.eat());
        System.out.println(chicken.getAge()+"岁的"+chicken.getColor()+"的公鸡会"+chicken.run());
        System.out.println(blackDuck.getAge()+"岁的"+blackDuck.getColor()+"的公鸡会"+blackDuck.eat());
        System.out.println(blackDuck.getAge()+"岁的"+blackDuck.getColor()+"的公鸡会"+blackDuck.run());

    }

}

abstract class Animla{

    private int age;
    private String color;
    public abstract String eat();

    public Animla(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Chicken extends Animla{

    public Chicken(int age, String color) {
        super(age, color);
    }

    public String run(){
        return "打鸣";
    }

    @Override
    public String eat() {
        return "啄米";
    }

}

class BlackDuck extends Animla{

    public BlackDuck(int age, String color) {
        super(age, color);
    }

    public String run(){
        return "游泳";
    }

    @Override
    public String eat() {
        return "吃鱼";
    }

}