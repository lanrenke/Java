package homework;

/**老师类Teacher

 属性：姓名name，年龄age，讲课内容content

 实例方法：吃饭eat方法，讲课teach方法

 静态方法：输出“在黑马上课学习”的study方法。

 定义测试类
    在main方法中使用无参构造器创建Teacher对象t，给t对象的成员变量赋值调用t对象的 eat 和 teach 方法。
    用类名Teacher类调用study方法。
 */
public class Teacher {

    public String name;
    public int age;
    public String content;

    public void eat(){
        System.out.println("年龄为"+name+"的"+name+"正在吃饭...");
    }
    public void teach(){
        System.out.println("年龄为"+age+"的"+name+"正在亢奋的讲着"+content+"...");
    }
    public static void study(){
        System.out.println("在黑马上课学习");
    }

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.name = "周老师";
        teacher.age = 30;
        teacher.content = "java面向对象的知识";

        teacher.eat();
        teacher.teach();

        Teacher.study();

    }

}
