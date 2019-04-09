package BaseCode._06构造器_默认构造器;
/**
    目标：构造器_默认构造器。

     语法：
    （1）一个类默认自带了一个无参数构造器，即使我们不写，它默认也会存在。
    （2）但是如果我们程序猿自己写了一个构造器，那么默认的无参数构造器就消失了
         假如此时还希望用这个无参数构造器，就需要自己定义无参数构造器了！！

 */
public class Animal {

    public String name ;
    public int age ;

    // 无参数构造器
    public Animal(){
        System.out.println("无参数构造器");
    }

    // 有参数构造器
    public Animal(String n){
        System.out.println("有参数构造器");
    }

    public static void main(String[] args) {
        // 创建一个动物对象
        // 类名 对象名称 = new 构造器;
        Animal taiDi = new Animal();
        taiDi.name = "泰迪";
        taiDi.age = 1 ;
        System.out.println(taiDi.name);
        System.out.println(taiDi.age);
    }
}
