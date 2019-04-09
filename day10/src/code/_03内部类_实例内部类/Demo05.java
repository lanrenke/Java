package code._03内部类_实例内部类;
/**
 实例内部类中访问当前所在外部类对象：外部类名称.this。
 */
public class Demo05 {
    public static void main(String[] args) {
        Body1.Heart heart = new Body1().new Heart();
        heart.jump();
    }
}

class Body1 {	// 身体
    private int weight = 30;

    // 在成员位置定义一个类:实例内部类，属于外部类对象的。
    class Heart {
        private int weight = 20;

        public void jump() {
            int weight = 10;
            System.out.println("心脏在跳动 " + weight);	// 10
            System.out.println("心脏在跳动 " + this.weight);	// 20
            System.out.println("心脏在跳动 " + Body1.this.weight);	// 30
        }
    }
}