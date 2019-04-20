package homework.Test1;
/**
     抛出异常
     异常处理

     请用代码实现如下需求
     1. 写一个方法实现获取字符串某个索引上的字符的功能
     2. 写一个测试方法调用上面写的方法,使用thows方式进行处理异常,并在main方法中调用这个测试方法
     3. 再写一个测试方法调用上面写的方法,使用try...catch方式进行处理异常,并在main方法中调用这个测试方法

     3. 提供一个静态方法:public static char charAt(String str, int index) 用于获取字符串str,index索引处的字符
     4. 在方法中charAt(String,int index)
     a) 当字符串为null抛出 Exception("字符串不能为null")异常,
     b) 当字符串为"" 的时候抛出Excetion("字符串不能为空") 异常;
     c) 当index不在 [0,str.length()-1] 之间的时,抛出Exception("索引越界") 异常.
     d) 否则返回str在index索引的字符
     5. 提供一个静态的方法testThrows() 用于测试charAt(String,intindex)方法
     a) 在方法中调用charAt(String,int index)方法;
     b) 使用throws方式对异常进行处理
     c) 在main方法中,调用本方法
     6. 提供一个静态方法testTryCatch(),用于测试charAt(String,int index)方法
     a) 在方法中调用charAt(String,int index)方法;
     b) 使用try...catch方式对异常进行处理
     c) 在main方法中,调用本方法

 */
public class Test06 {

    public static void main(String[] args) {

        //testThrows(); //该方法是thows声明的 要想在main方法中使用只能try...catch
        testTryCatch();

    }


    public static void testThrows() throws Exception {

        char c = charAt("abcd",4);
        System.out.println(c);

    }

    public static void testTryCatch(){

        try {
            charAt("abcd",4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static char charAt(String str, int index) throws Exception{

        if (str == null){
            throw new Exception("字符串不能为null");
        }
        if (str.equals("")){
            throw new Exception("字符串不能为空");
        }
        if (index < 0 || index >= str.length()){
            throw new Exception("索引越界");
        }
        return str.charAt(index);

    }

}
