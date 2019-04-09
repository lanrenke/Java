package code._03封装set方法参数用this实现见明知意;

/**
 目标： 封装set方法参数用this实现见明知意

 this关键字：
     -- 代表当前对象
     -- this关键字只能出现在实例方法和构造器中。
     -- this出现在实例方法中谁调用这个方法，this就代表谁。
     this可以用于访问对象的成员，不是访问局部成员。

 */
public class TestStudent01 {

    public static void main(String[] args) {

        Student yuYang = new Student();
        yuYang.setName("余洋");
        yuYang.setAge(20);
        System.out.println(yuYang.getName());
        System.out.println(yuYang.getAge());

    }

}
