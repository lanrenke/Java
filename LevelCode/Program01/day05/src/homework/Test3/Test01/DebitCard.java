package homework.Test3.Test01;

public class DebitCard {

    private String accountNumber;
    private double money;

    public DebitCard() {
    }

    public DebitCard(String accountNumber, double money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money < 0){
            throw new MoneyException("金额不能为负值");
        }
        this.money = money;
    }

}
