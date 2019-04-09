package homework._抽象类;
/**
 1. 在传智播客有很多员工(Employee),按照工作内容不同分教研部员工(Teacher)和行政部员工(AdminStaff)
 2. 教研部根据教学的方式不同又分为讲师(Lecturer)和助教(Tutor)
 3. 行政部根据负责事项不同,又分为维护专员(Maintainer),采购专员(Buyer)
 4. 公司的每一个员工都编号,姓名和其负责的工作
 5. 每个员工都有工作的功能,但是具体的工作内容又不一样,在向上抽取的时候定义为抽象方法

 开发提示：
    1. 定义抽象类员工类(Employee) a)成员变量: 工号(id),姓名(name) b)抽象方法: void work(); c)提供无参和带参的构造方法以及setters和getters
    2. 定义抽象类教研部员工（Teacher）类继承员工类(Employee) a)提供无参和带参的构造方法
    3. 定义抽象类行政部员工(AdminStaff)类继承员工类(Employee) a)提供无参和带参的构造方法
    4. 定义讲师(Lecturer)类继承研部员工（Teacher）类 a)提供无参和带参的构造方法 b)实现抽象方法: voidwork(); 输出格式: 工号为 666 的讲师 傅红雪 在讲课
    5. 定义助教(Tutor)类继承研部员工（Teacher）类 a)提供无参和带参的构造方法 b)实现抽象方法: void work(); 输出格式: 工号为 668 的助教 顾棋 在帮助学生解决问题
    6. 定义维护专员(Maintainer)类继承行政部员工(AdminStaff)类 a)提供无参和带参的构造方法 b)实现抽象方法: void work();输出格式: 工号为 686 的维护专员 庖丁 在解决不能共享屏幕问题
    7. 定义采购专员(Buyer) 类继承行政部员工(AdminStaff)类 a)提供无参和带参的构造方法 b)实现抽象方法: void work(); 输出格式: 工号为 888 的采购专员 景甜在采购音响设备
    8. 定义测试类Test8 a)创建讲师对象 l, 把工号赋值为666,姓名赋值为”傅红雪” b)调用讲师对象l的工作方法 c)创建助教对象 t, 把工号赋值为668,姓名赋值为”顾棋” d)调用助教对象t的工作方法 e)创建维护专员对象 m,
    把工号赋值为686,姓名赋值为”庖丁” f)调用维护专员对象m的工作方法 g)创建采购专员对象 b, 把工号赋值为888,姓名赋值为”景甜” h)调用采购专员对象b的工作方法
 */
public class Test05 {

    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer(666,"傅红雪");
        Tutor tutor = new Tutor(668,"顾棋");
        Maintainer maintainer = new Maintainer(686,"庖丁");
        Buyer buyer = new Buyer(888,"景甜");
        lecturer.work();
        tutor.work();
        maintainer.work();
        buyer.work();

    }

}

class Lecturer extends Teacher{

    public Lecturer() {
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为: "+super.getId()+" 的讲师 "+super.getName()+"在讲课");
    }
}

class Tutor extends Teacher{

    public Tutor() {
    }

    public Tutor(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为: "+super.getId()+" 的助教 "+super.getName()+"在帮助学生解决问题");
    }
}

class Maintainer extends AdminStaff{

    public Maintainer() {
    }

    public Maintainer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为: "+super.getId()+" 的维护助员 "+super.getName()+"在解决不能共享屏幕问题");
    }

}

class Buyer extends AdminStaff{

    public Buyer() {
    }

    public Buyer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为: "+super.getId()+" 的采购专员 "+super.getName()+"在采购音响设备");
    }

}

abstract class Employee{

    private int id;
    private String name;

    public abstract void work();

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

abstract class Teacher extends Employee{

    public Teacher() {
    }

    public Teacher(int id,String name){
        super(id, name);
    }

}

abstract class AdminStaff extends Employee{

    public AdminStaff() {
    }

    public AdminStaff(int id, String name) {
        super(id, name);
    }
}
