package homework;
/**
 * 定义showColor方法，根据英文单词，输出对应的颜色。 red 输出 红色 , blue 输出 蓝色 , green 输出 绿
   色 , 其他情况 输出 未知
   编写步骤：
     1. showColor方法,参数为String类型的color,返回值为空
     2. 在showColor方法中使用switch对传入的color变量进行匹配
     3. 如果匹配上"red",输出红色,并结束switch
     4. 如果匹配上"blue",输出蓝色,并结束switch
     5. 如果匹配上"green",输出绿色,并结束switch
     6. 默认情况,输出颜色未知,并结束switch
     7. 在main方法中调用showColor方法,传入"red"字符串
 * */
public class Test05 {

    public static void main(String[] args) {

        showColor("blue");

    }

    public static void showColor(String color){

        switch (color){

            case "red":
                System.out.println("红色");
                break;
            case "blue":
                System.out.println("蓝色");
                break;
            case "green":
                System.out.println("绿色");
                break;
            default:
                System.out.println("颜色未知");

        }

    }

}
