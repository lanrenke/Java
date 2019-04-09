package homework;
/**Manager类：
    属性：姓名，工号，薪资，奖金
    构造器：无参构造器，满参构造器
    成员方法：
        intro方法：打印姓名，工号信息
        showSalary方法：打印薪资和奖金信息
        work方法：打印"正在努力的做着管理工作,分配任务,检查员工提交上来的代码....."
 */
public class Manager {

    public String name;
    public String num;
    public int wages;
    public int bonus;

    public void intro(){

        System.out.println("经理姓名:"+name);
        System.out.println("工号:"+num);

    }

    public void showSalary(){
        System.out.println("基本工资为"+wages+",奖金为"+bonus);
    }

    public static void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }

    public Manager(){

    }

    public Manager(String a,String b,int c,int d){
        name = a;
        num = b;
        wages = c;
        bonus = d;
    }

}
