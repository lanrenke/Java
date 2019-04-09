package homework;
/**定义一个扑克类Card
    属性：
        花色
        点数
    构造器：
        有参构造器
    成员方法：
        showCard方法：打印牌面信息
    定义测试类
        在main方法中使用满参构造创建Card对象card，并调用showCard方法*/
public class Card {

    public String color;
    public char point;

    public void showCard(){

        System.out.println(color+point);

    }

    public Card(String a,char b){

        color = a;
        point = b;

    }

    public static void main(String[] args) {

        Card card = new Card("黑桃",'A');
        card.showCard();

    }

}
