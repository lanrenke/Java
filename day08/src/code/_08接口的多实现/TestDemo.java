package code._08接口的多实现;
/**
 目标：接口的多实现。
 接口的实现类写法：
     修饰符 class 实现类 implements 接口1,接口2,接口3,...{

     }

 */
public class TestDemo {



}

interface SportMan{

    void run();
    void abroad();

}

interface Law{

    void rule();
    void run();

}

class PingPongMan implements SportMan,Law{

    @Override
    public void rule() {

    }

    @Override
    public void run() {

    }

    @Override
    public void abroad() {

    }

}









