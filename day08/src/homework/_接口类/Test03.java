package homework._接口类;
/**编写步骤：
     1. 定义接口AA，普通类BB实现接口AA
     2. AA接口中，定义抽象方法showA
     3. AA接口中，定义私有方法show10（String str），循环打印10次str
     4. AA接口中，定义默认方法showB10，showC10，分别调用show10方法，传入参数
     5. 测试类中，创建BB对象，调用showA方法，showB10方法，showC10方法
 */
public class Test03 {

    public static void main(String[] args) {

        BB bb = new BB();
        bb.showA();
        bb.showB10("BBBB");
        bb.showC10("CCCC");

    }

}

interface AA{

    void showA();

    public default void showB10(String str){
        show10(str);
    }

    public default void showC10(String str){
        show10(str);
    }

    private void show10(String str){

        for (int i = 0; i < 10; i++) {
            System.out.print(str+" ");
        }
        System.out.println();

    }

}

class BB implements AA{

    @Override
    public void showA() {
        System.out.println("AAAA");
    }

}
