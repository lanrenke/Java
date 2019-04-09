package homework;
/**
    定义一个父类Animal 包含name,weight属性和一个抽象的eat方法,
        定义两个子类Dog和Cat,
        Dog特有方法lookHome,
        Cat特有方法catchMouse;
        并且重写eat方法,Dog吃骨头,Cat吃鱼
    要求:使用多态形式创建Dog和Cat对象,调用eat方法,并且使用向下转型,如果是Cat类型调用catchMouse功能,
        如果是Dog类型调用lookHome功能

    编写步骤
         1. 定义抽象类Animal
         2. 在抽象类Animal中包含name,weight属性和一个抽象的eat方法
         3. 定义Cat类继承Animal类
         4. 在Cat类中重写eat方法
         5. 在Cat类中定义catchMouse方法
         6. 定义Dog类继承Animal类
         7. 在Dog类中重写eat方法
         8. 在Dog类中定义lookHome方法9. 使用多态创建狗对象d
         10. 使用多态创建猫对象c
         11. 调用d对象的eat方法
         12. 调用c对象的eat方法
         13. 使用instanceof判断d对象是否是Dog类
         14. 如果d对象是Dog类,将d对象向下转型为Dog类型,并调用lookHome方法
         15. 使用instanceof判断c对象是否是Cat类
         16. 如果c对象是Cat类,将c对象向下转型为Cat类型,并调用catchMouse方法
 */
public class Test02 {

    public static void main(String[] args) {

        Animal c = new Cat();
        Animal d = new Dog();
        d.eat();
        c.eat();

        if(c instanceof Cat){

            Cat cat = (Cat)c;
            cat.cathcMouse();

        }
        if (d instanceof Dog){

            Dog dog = (Dog)d;
            dog.lookHome();

        }


    }

}

abstract class Animal{

    private String name;
    private String weight;
    public abstract void eat();

    public Animal() {
    }

    public Animal(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void cathcMouse(){
        System.out.println("努力抓老鼠");
    }

}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome(){
        System.out.println("老老实实看家");
    }

}