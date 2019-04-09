package homework;
/**根据需求，完成如下代码，并在测试类中进行测试。
     员工类 Employee:
     属性: 姓名 工号 工资
     抽象方法: 工作 work, 开会 meet
    使用匿名内部类方式创建一个员工类,并调用其工作和开会的功能
 */
public class Test01 {

    public static void main(String[] args) {

        Employee employee = new Employee() {
            @Override
            public void work() {
                System.out.println("正在认真的工作");
            }

            @Override
            public void meet() {
                System.out.println("正在集体开会");
            }
        };
        employee.work();
        employee.meet();

    }

}

abstract class Employee{

    private String name;
    private String num;
    private double salary;

    public abstract void work();
    public abstract void meet();

    public Employee() {
    }

    public Employee(String name, String num, double salary) {
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}