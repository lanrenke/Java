package basecode._09泛型上下限;

public class Animal {
    public void eat(){
        System.out.println("动物在吃");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
