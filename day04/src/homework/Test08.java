package homework;
/**
 * 温度转换：摄氏度与华氏度的相互转换
 * 华氏度 = (9.0/5)*摄氏度 + 32;
 * */
public class Test08 {

    public static void main(String[] args) {

        transfer("摄氏度",130);

    }

    public static void transfer(String ch,double num){

        switch (ch){

            case "摄氏度":
                double h_num = (9.0/5)*num + 32;
                System.out.println("摄氏度为:"+num+"--华氏度为:"+h_num);
                break;
            case "华氏度":
                double s_num = (num - 32)*5/9;
                System.out.println("华氏度为:"+num+"--摄氏度为:"+s_num);
                break;
            default:
                System.out.println("输出参数错误");

        }

    }

}
