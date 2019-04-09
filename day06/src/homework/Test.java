package homework;
/**
 定义测试类，创建Manager对象，创建Coder对象，并测试
 */
public class Test {

    public static void main(String[] args) {

        Manager manager = new Manager("Jams","9527",15000,3000);
        Coder coder = new Coder("kobe","0025",10000);

        manager.intro();
        manager.showSalary();
        Manager.work();

        System.out.println("======================");

        coder.intro();
        coder.showSalary();
        Coder.work();

    }

}
