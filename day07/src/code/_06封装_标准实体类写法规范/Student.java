package code._06封装_标准实体类写法规范;
/**
 实体类：指的是具体存在的对象数据类。学生类，老师类，动物类，测试类（不是的，执行代码的）
    成员变量
        -- 建议私有，用private修饰
    构造器
         -- 无参构造器【必须有】
         -- 有参构造器【建议有】
     成员方法
         -- 建议公开，用public修饰。
         getXxx()
         setXxx()

 */
public class Student {

    private String name ;
    private int age;

    // 普通方法：建议公开
    public void sing(){
        System.out.println(name +" 已经"+age +" 在快乐的睡梦中唱歌！");
    }

    // -- 无参构造器【必须有】 默认会有
    public Student() {
    }

    //  -- 有参构造器【建议有】
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

}
