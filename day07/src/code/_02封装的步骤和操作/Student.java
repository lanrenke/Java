package code._02封装的步骤和操作;

public class Student {

    private String name ;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String a) {
      name = a;
    }

    // getter:获取成员变量的值，命名规范是：get+成员变量首字母大写
    public int getAge() {
        return age;
    }

    // setter:给成员变量赋值，  命名规范是：set+成员变量首字母大写
    public void setAge(int a) {

        if(age>0 && age<=200){
            age = a;
        }else {
            System.out.println("年龄数据非法！");
        }

    }

}
