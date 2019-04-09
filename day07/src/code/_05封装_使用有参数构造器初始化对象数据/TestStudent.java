package code._05封装_使用有参数构造器初始化对象数据;
/**
 目标：封装_使用有参数构造器初始化对象数据

 小结：
     有参数构造器可以在初始化对象的时候同时为对象的数据赋值。
     this可以出现在构造器中，代表构造器正在初始化的当前对象。
 */
public class TestStudent {

    public static void main(String[] args) {

        Student mjj = new Student("马俊杰" , 18 , '男',180);
        mjj.setAge(19);
        System.out.println(mjj.getName());
        System.out.println(mjj.getAge());
        System.out.println(mjj.getSex());
        System.out.println(mjj.getHeight());

    }


}
