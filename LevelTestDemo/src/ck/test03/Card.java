package ck.test03;

public class Card {

    private String type;
    private int balance;

    public Card() {
    }

    public Card(String type, int balance) {
        this.type = type;
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
