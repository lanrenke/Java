package basecode._10斗地主案例;

public class Poker {

    // 数字
    private String number;
    // 花色
    private String color;

    @Override
    public String toString() {
        return color + number; // ♣3
    }

    public Poker() {
    }

    public Poker(String number, String color) {
        this.number = number;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
