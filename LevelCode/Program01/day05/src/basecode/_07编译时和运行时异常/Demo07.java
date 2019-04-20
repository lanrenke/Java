package basecode._07编译时和运行时异常;

/**
    目标：能够理解运行时异常和编译时异常的特点

    讲解：
        1. 异常的分类
            编译时异常：除了RuntimeException以外的异常都是 编译时异常
            运行时异常：RuntimeException及其子类异常都是 运行时异常

        2. 如何区分异常是编译时异常还是运行时异常
            根据类名查找文档，查看异常类的继承体系，如果有RuntimeException则就是运行时异常
            否则都是编译时异常。

        3. 运行时异常和编译时异常的特点
            运行时异常
                 1. 方法体中抛出运行时异常，则可以处理，也可以不处理。  不处理程序也是会自动死掉
                 2. 方法声明上声明运行时异常，则方法调用者可以处理，也可以不处理

            编译时异常
                 1. 方法体中抛出编译时异常，则必须要处理
                 2. 方法声明上声明编译时异常，则方法调用者必须要处理

        4. 为什么Java编译器对运行时异常管理如此松散？
            因为运行时异常一般是可以通过程序猿良好的编程习惯避免 很多都是逻辑错误 再语法上就需要修改的异常

    小结：
        1. 运行时异常的特点
             1. 方法体中抛出运行时异常，则可以处理，也可以不处理。
             2. 方法声明上声明运行时异常，则方法调用者可以处理，也可以不处理

        2. 编译时异常的特点
             1. 方法体中抛出编译时异常，则必须要处理
             2. 方法声明上声明编译时异常，则方法调用者必须要处理
 */
public class Demo07 {
    public static void main(String[] args){
       /* try {
            div(0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        div(1);
    }

    public static void div(int num) throws ArithmeticException{
        if(num == 0){
            // 创建数学运算异常对象并抛出给方法调用者
            // ArithmeticException：运行时异常
            throw new ArithmeticException("除数不能为零");

            // 抛出编译时异常
            // throw new FileNotFoundException("xxx");
        }

        // 字符串
        // NullPointerException：运行时异常
        String str = "abc";
        if (str != null){
            System.out.println(str.length());
        }

        // StringIndexOutOfBoundsException：运行时异常
        int index = 3;
        if (index < str.length()){ //这里已经避免出现异常了
            System.out.println(str.charAt(index));
        }

        // 数组
        int[] arr = {1,2};
        int i = 2;
        // ArrayIndexOutOfBoundsException：运行时异常
        if (i < arr.length){
            System.out.println(arr[i]);
        }

        /*FileReader fr = new FileReader("aaa.txt");
        System.out.println(fr.read());
        fr.close();*/
    }

}
