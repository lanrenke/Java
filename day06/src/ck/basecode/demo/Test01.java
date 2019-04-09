package ck.basecode.demo;

public class Test01 {

    public static void main(String[] args) {

        //无参数构造器情况下
        //定义一个类里面的成员内部类的操作方法，先建立类的对象，然后通过对象来建立成员内部类的对象。
        Test01 test01 = new Test01();
        Student man = test01.new Student();//这里的格式是新东西，需要重点注意
        man.name = "张三";
        man.age = 20;
        man.sex = '男';
        man.address = "广州天河区";
        System.out.println(man.name);
        System.out.println(man.email);//null

        System.out.println("------------------");

        Student man2 = test01.new Student();
        man2.name = "李四";
        man2.age = 18;
        man2.sex = '女';
        man2.address = "广州南沙区";
        System.out.println(man2.address);
        System.out.println(man2.email); //null

    }

    public class Student{

        public String name;
        public char sex;
        public int age;
        // 班级
        public String className;
        // 家庭地址
        public String address;
        // 电话
        public String tel;
        // 邮箱
        public String email;
        // 身高
        public double height;
        // 体重
        public double weight;

        // 无参数构造器:无参数构造器是默认存在的，即使不写也会存在这个构造器
        public Student(){
            System.out.println("无参数构造器被调用");
        }

    }

}
