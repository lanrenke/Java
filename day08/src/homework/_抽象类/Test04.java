package homework._抽象类;
/**
 请使用代码描述:
     1. 经理
         成员变量:工号,姓名,工资
         成员方法:工作(管理其他人),吃饭(吃鱼)
     2. 厨师
         成员变量:工号,姓名,工资
         成员方法:工作(炒菜),吃饭(吃肉)

 开发提示：
     把经理和厨师的共性内容(工号属性,姓名属性,工资属性,工作方法,吃饭方法)抽取到员工类中
     员工类中定义抽象的工作方法和抽象的吃饭方法
     经理继承员工,重写工作方法,和吃饭方法
     厨师继承员工,重写工作方法,和吃饭方法
 */
public class Test04 {

    public static void main(String[] args) {

        Manager manager = new Manager("m110","老王",10000);
        Chef chef = new Chef("c110","小王",6000);

        System.out.println("工号为"+manager.getNum()+",姓名为:"+manager.getName()+"工资为:"+manager.getSalary()+"的经理在"+manager.eat());
        System.out.println("工号为"+manager.getNum()+",姓名为:"+manager.getName()+"工资为:"+manager.getSalary()+"的经理在工作,"+manager.work());
        System.out.println("工号为"+chef.getNum()+",姓名为:"+chef.getName()+"工资为:"+chef.getSalary()+"的厨师在"+chef.eat());
        System.out.println("工号为"+chef.getNum()+",姓名为:"+chef.getName()+"工资为:"+chef.getSalary()+"的厨师在工作,"+chef.work());

    }

}

abstract class Personnel{

    private String num;
    private String name;
    private double salary;

    public abstract String work();
    public abstract String eat();

    public Personnel(String num, String name, double salary) {
        this.num = num;
        this.name = name;
        this.salary = salary;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Personnel{

    public Manager(String num, String name, double salary) {
        super(num, name, salary);
    }

    @Override
    public String work() {
        return "管理其他人";
    }

    @Override
    public String eat() {
        return "吃鱼";
    }

}

class Chef extends Personnel{

    public Chef(String num, String name, double salary) {
        super(num, name, salary);
    }

    @Override
    public String work() {
        return "炒菜";
    }

    @Override
    public String eat() {
        return "吃肉";
    }

}