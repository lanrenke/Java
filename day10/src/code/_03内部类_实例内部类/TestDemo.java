package code._03内部类_实例内部类;
/**
 目标：内部类——实例内部类。

 什么是实例内部类？
    无static修饰，属于外部类的对象的。宿主是外部类对象，寄生是实例内部类
 实例内部类的成分：
     可以定义实例成员。
    不能定义静态成员。
 实例内部类的访问：
    外部类名.内部类名
 创建实例内部类的对象:
    外部类名.内部类名 = new 外部类构造器.new 内部类构造器;
 拓展:
     实例内部类是否可以直接访问外部类的实例成员？可以的，因为实例内部类属于外部类对象，可以直接访问外部类对象的实例成员。
    实例内部类是否可以直接访问外部类的静态成员？可以的，外部类的静态成员只有一份，可以共享访问。
 小结：
    实例内部类属于外部类对象，必须用外部类对象来创建对象。
 */
public class TestDemo {

    public static void main(String[] args) {

        Body.Heart heart = new Body().new Heart();
        heart.setName("Jack");
        heart.run();

    }

}

class Body{

    private int age;
    public static String schoolName;

    public class Heart{

        private String name;

        public void run(){

            System.out.println(name +"活着！！");
            System.out.println(age);
            System.out.println(schoolName);

        }

        //public static String addr = "人";//不能定义静态成员。
        public static final int AGE1 = 12;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}