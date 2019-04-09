package code._06封装_标准实体类写法规范;

public class TestMain01 {

    public static void main(String[] args) {

        // 创建对象：无参数构造器创建对象
        Student yangSen = new Student();
        yangSen.setName("杨森");
        yangSen.setAge(21);
        System.out.println(yangSen.getName());
        System.out.println(yangSen.getAge());
        yangSen.sing();

        // 创建对象：有参数构造器创建对象
        Student quLiang = new Student("瞿亮",23);
        quLiang.setAge(18);// 修改年龄
        System.out.println(quLiang.getName());
        System.out.println(quLiang.getAge());
        quLiang.sing();

    }

}
