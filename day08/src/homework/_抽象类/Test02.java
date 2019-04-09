package homework._抽象类;
/** 编写步骤：
        1. 定义抽象类A，抽象类B继承A，普通类C继承B
        2. A类中，定义成员变量numa，赋值为10，抽象showA方法。
        3. B类中，定义成员变量numb，赋值为20，抽象showB方法。
        4. C类中，定义成员变量numc，赋值为30，重写showA方法，打印numa，重写showB方法，打印
        numb，定义showC方法，打印numc。
        5. 测试类中，创建C对象，调用showA方法，showB方法，showC方法。
 */
public class Test02 {

    public static void main(String[] args) {

        C c = new C();
        System.out.print("A类中的numa:");
        c.showA();
        System.out.print("B类中的numb:");
        c.showB();
        System.out.print("C类中的numc:");
        c.showC();


    }

}


abstract class A{

    private int numa = 10;
    public abstract void showA();

    public int getNuma() {
        return numa;
    }

    public void setNuma(int numa) {
        this.numa = numa;
    }
}

abstract class B extends A{

    private int numb = 20;
    public abstract void showB();

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }
}

class C extends B{

    private int numc = 30;

    public void showC(){
        System.out.println(numc);
    }

    @Override
    public void showA() {
        System.out.println(super.getNuma());
    }

    @Override
    public void showB() {
        System.out.println(super.getNumb());
    }

}