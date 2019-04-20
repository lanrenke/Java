package homework.Test1;

import java.util.ArrayList;

/**
     可变参数
     定义一个方法add接收0个及以上的String类型数据,这个方法的作用是将传入的String类型的参数放入一个ArrayList
     中,并返回这个ArrayList集合
     1. 定义add方法,参数是(String... str),返回值是ArrayList
     2. 在add方法中创建ArrayList用于存放传入的字符串
     3. 使用增强for循环获取每个参数
     4. 将每个参数都添加到ArrayList中
     5. 返回array
     6. 调用add方法传入任意个字符串
     7. 使用增强for遍历返回的ArrayList,打印每个元素
 */
public class Test09 {

    public static void main(String[] args) {
        
        ArrayList<String> list = add("aa","bb","cc","dd");
        for (String s : list) {
            System.out.println(s);
        }
        
    }
    
    public static ArrayList add(String...str){
        
        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < str.length; i++) {
//            list.add(str[i]);
//        }
        for (String s : str) {
            list.add(s);
        }

        return list;
        
    }
    
}
