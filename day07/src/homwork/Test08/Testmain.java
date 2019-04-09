package homwork.Test08;

public class Testmain {

    public static void main(String[] args) {

        MyDate date = new MyDate(2004,1,1);
        date.showDate();
        boolean isBi = date.isBi();
        if (isBi){
            System.out.println(date.getYear()+"年是闰年");
        }else {
            System.out.println(date.getYear()+"年不是闰年");
        }

    }

}
