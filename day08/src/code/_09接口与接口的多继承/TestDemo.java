package code._09接口与接口的多继承;
/**
 目标：接口与接口的多继承

     类与接口是：多实现关系，一个类可以实现多个接口。implements
     接口与接口是：多继承关系，一个接口可以继承多个接口。extends
        修饰符 interface 子接口 extends 父接口1，父接口2，...{

        }

 */
public class TestDemo {
}

interface Law{
    void rule();
}

interface Go{
    void abroad();
    void compttion();
}

// 接口与接口的多继承：规范合并！！
interface SportMan extends Law , Go {
    void run();
}

//class BlueMan implements Go , Law , SportMan{
class BlueMan implements SportMan{

    @Override
    public void run() {

    }

    @Override
    public void rule() {

    }

    @Override
    public void abroad() {

    }

    @Override
    public void compttion() {

    }
}