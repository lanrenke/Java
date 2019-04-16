package homework.Test1;
/**
    泛型⽅法

    ⾃定义泛型⽅法function.可以传⼊任意类型数据t.在这个⽅法中打印传⼊的t.并使⽤这个泛型⽅法。

     1. 定义泛型⽅法
     2. 在泛型⽅法中,将传⼊的参数放到输出语句中
     3. 调⽤function传⼊字符串
     4. 调⽤function传⼊数字

 */
public class Test06 {

    public static void main(String[] args) {

        printDemo("Abc");
        printDemo(456);

    }
    //1. 定义泛型⽅法
    public static <T> void printDemo(T t){
        System.out.println(t);
    }
}
