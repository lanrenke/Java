package homework;
/**
    模拟公司给员工发工资

     开发提示：
         1. 定义员工Employee类。包含属性：姓名，薪资
         2. 定义经理Manager类继承Employee类
         3. 定义程序员Coder类继承Employee类
         4. 定义Money接口，提供抽象方法paySalary,参数为Employee
         5. 定义公司Company类，实现Money接口,Company类包含公司总资金属性
         6. 定义测试类，创建Company对象，Manager对象，Coder对象，调用公司paySalary方法，给Manager和Coder发工资

     编写步骤
         1. 定义Employee类,包含属性：姓名，薪资
         2. 定义经理Manager类继承Employee类
         3. 定义程序员Coder类继承Employee类
         4. 定义Money接口包含抽象的paySalary方法,参数为(Employee emp)
         5. 定义Company类,实现Money接口,Company类包含公司总资金属性
         6. 在Company类中重写paySalary方法.当给一个员工发工资的时候.公司总资金减去已发工资
         7. 在main方法中创建Manager对象m
         8. 在main方法中创建Coder对象c
         9. 在main方法中创建Company对象
         10. 在main方法中调用Company的paySalary方法,传入m和c对象
 */
public class Test04 {

    public static void main(String[] args) {

        Manager manager = new Manager("张小强",9000);
        Coder coder = new Coder("李小亮",5000);
        Company company = new Company(1000000);
        company.playSalary(manager);
        company.playSalary(coder);

    }

}

class Manager extends Employee{

    public Manager() {
    }

    public Manager(String name, double salary) {
        super(name, salary);
    }

}

class Coder extends Employee{

    public Coder() {
    }

    public Coder(String name, double salary) {
        super(name, salary);
    }

}

class Company implements Money{

    private double money;

    public Company() {
    }

    public Company(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void playSalary(Employee emp) {
        money -=emp.getSalary();
        System.out.println("给"+emp.getName()+"发工资 "+emp.getSalary()+" 元,公司剩余: "+money+" 元");
    }

}

class Employee{

    private String name;
    private double Salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

}

interface Money{
    void playSalary(Employee emp);
}