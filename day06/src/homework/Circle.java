package homework;
/**定义一个圆形Circle类
    属性：
        r：半径
    构造器：
        无参构造器
        有参构造器
    成员方法：
        showArea方法：打印圆形面积
        showPerimeter方法：打印圆形周长
    定义测试类，创建Circle对象，并测试。
 */
public class Circle {

    public int r;

    public void showArea(){

        double area = 3.14*r*r;
        System.out.println("半径为:"+r+"，面积为:"+area);

    }

    public void showPerimeter(){

        double perimerter = 2*3.14*r;
        System.out.println("半径为:"+r+"，周长为:"+perimerter);

    }

    public Circle(){

    }

    public Circle(int a){
        r = a;
    }

    public static void main(String[] args) {

        Circle circle = new Circle(8);
        circle.showArea();
        circle.showPerimeter();

    }

}
