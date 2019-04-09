package homework;
/** 定义一个Dog类
 属性：
    姓名String类型(私有)
    年龄int类型(私有)
 构造器：
    无参构造器，
    有参数构造器
 定义测试类
    在main方法中使用有参构造器创建Dog对象，并初始化对象的数据。
    打印Dog对象的姓名和年龄*/
public class Dog {

    public String name;
    public int age;

    public Dog(){

    }
    public Dog(String name, int age){

        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {

        Dog Dog = new Dog("旺财",5);
        System.out.println("狗狗的名称为:"+Dog.name+"，年龄为:"+Dog.age);

    }

}
