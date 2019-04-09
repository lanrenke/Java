package BaseCode._02类的成分和定义类;

public class Student {
    /**
      成员变量  修饰符 数据类型 变量名称 = 初始值;
     */
    public int age;
    public String name;

    /** 成员方法     修饰符 返回值类型 方法名称 ( 形参列表 ){}
    */
    public void name(){
        System.out.println("1");
    }
    /**
      构造器    修饰符 类名(形参列表){
                  执行代码
     }
     * */
    public Student(){
        System.out.println("无参数构造器");

    }
    public Student(String name){
        System.out.println("有参数构造器");
    }
    public static void main(String[] args) {
        /**
         用构造器得到一个对象

         */
        Student jay = new Student( );

    }
}
