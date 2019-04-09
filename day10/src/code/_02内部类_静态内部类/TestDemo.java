package code._02内部类_静态内部类;
/**
     目标：静态内部类。

     什么是静态内部类？
        属于外部类本身的，只有一份，必须有static修饰。
     静态内部类的成分:
        类的成分它都可以有，与普通类无区别，只是人家在一个类的里面而已。
     静态内部类的访问：
        外部类.内部类。
     静态内部类创建对象的格式：
        外部类名.内部类名 对象名称 = new 外部类名.内部类构造器;
     拓展：
        静态内部类可以直接访问外部类的静态成员吗？可以的，外部类的静态成员属于外部类只有一份可以被共享。
         静态内部类可以直接访问外部类的实例成员吗？不可以的，外部类的实例成员属于外部类对象，必须用外部类对象来访问。
     小结：
        静态内部类的用法与外部类的用法没有差别，只是静态内部类属于某个外部类，要用外部类.内部类来访问而已。
 */
public class TestDemo {

    public static void main(String[] args) {

        // 外部类名.内部类名 对象名称 = new 外部类名.内部类构造器;
        Car.Engine bmw = new Car.Engine();
        bmw.run();
        Car.Engine.inAddr();

    }

}

// 外部类
class Car{

    private static String brand;
    private String color;

    // 静态内部类：属于外部类本身的，只有一份，必须有static修饰。
    public static class Engine{

        private String name;
        private static String schoolName ;

        public Engine(){

        }

        public void run(){
            System.out.println(brand);
            Car car = new Car();
            System.out.println(car.color);
        }

        public static void inAddr(){
            System.out.println(brand);
        }

    }



    public Car(String color) {
        this.color = color;
    }

    public Car() {
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Car.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
