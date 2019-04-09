package homework;
/**Coder类：
    属性：姓名，工号，薪资
    构造器：无参构造器，有参构造器
    成员方法：
        intro方法：打印姓名，工号信息
        showSalary方法：打印薪资信息
        work方法：打印"正在努力写代码...."
 */
public class Coder {

    public String name;
    public String num;
    public int wages;

    public void intro(){

        System.out.println("程序员姓名:"+name);//在同一个类中的参数可以直接调用
        System.out.println("工号:"+num);

    }

    public void showSalary(){
        System.out.println("基本工资为"+wages+",奖金无");
    }

    public static void work(){
        System.out.println("正在努力写代码....");
    }

    public Coder(){

    }

    public Coder(String a,String b,int c){

        name = a;
        num = b;
        wages = c;

    }

}
