package code._05内部类_匿名内部类;
/**
     目标：匿名内部类的使用。
     案例：开始游泳（学生，老师，运动员）
 */
public class SwimmingDemo02 {

    public static void main(String[] args) {

        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生在游泳");
            }
        });

        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师在游泳");
            }
        });

    }

    public static void start(Swim s){
        s.swimming();
    }

}


interface Swim{
    void swimming();
}