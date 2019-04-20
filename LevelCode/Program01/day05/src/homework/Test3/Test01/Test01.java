package homework.Test3.Test01;
/**
     自定义异常

     每一张借记卡(DebitCard)都有账号(accountNumber)和余额(money); 余额永远不能为负数
     要求：当借记卡的余额为负数的时候需要抛出自定的异常

 */
public class Test01 {

    public static void main(String[] args) {

        DebitCard card = new DebitCard();

        card.setMoney(200);
        System.out.println(card.getMoney());

        card.setMoney(-200);

    }


}
