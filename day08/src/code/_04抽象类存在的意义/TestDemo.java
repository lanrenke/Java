package code._04抽象类存在的意义;

/**
 目的：抽象类存在的意义。

 抽象类存在的意义：
     1.被继承。
     抽象类就是为了派生子类，就是为了被子类继承。
     2.抽象类体现的是模板思想。（拓展）
     抽象类是部分实现，部分抽象体现模板思想（模板）

 用抽象类来设计一个模板模式：
     设计模式：是前人已经总结好的优良软件设计模型，后来者直接使用即可得到很好的设计模式。
     模板模式：相同的东西模板做好，不同的东西交给具体使用模板的人去做！

 案例：
     用抽象类来写一个模板模式：作文模板。
 */
public class TestDemo {

    public static void main(String[] args) {

        Student student = new Student();
        student.write();

        Teacher teacher = new Teacher();
        teacher.write();

    }

}

class Teacher extends Template{

    @Override
    public String writeMain() {
        return "\t\t我爸爸也牛逼，反正就是很牛逼！";
    }

}

class Student extends Template{

    @Override
    public String writeMain() {
        // 正文
        return "\t\t我把是李刚，我经常横着走路，我简直碉堡了!!";
    }

}

// 写一个作为模板
abstract class Template{
    // 标题
    private String title = "\t\t\t\t\t\t《我的爸爸》"; // 已经实现好的
    private String one = "\t\t我的爸爸很牛逼，有多牛逼呢，请看正文。";
    private String last = "\t\t下辈子还要找一个这么牛逼的爸爸，我的吹水结束了。";

    // 提供写作为的方法
    public void write(){
        System.out.println(title);
        System.out.println(one);
        // 正文：模板不知道怎么写，要由使用模板的子类自己去写！ 部分抽象出来
        System.out.println(writeMain());
        // 结尾
        System.out.println(last);
    }

    // 定义一个抽象方法来书写正文，具体怎么写是由子类到时候来实现的。
    public abstract String writeMain();

}