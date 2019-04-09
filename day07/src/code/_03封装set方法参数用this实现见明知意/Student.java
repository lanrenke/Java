package code._03封装set方法参数用this实现见明知意;

public class Student {

    private String name ;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    // getter:获取成员变量的值，命名规范是：get+成员变量首字母大写
    public int getAge() {
        return age;
    }

    // setter:给成员变量赋值，  命名规范是：set+成员变量首字母大写
    public void setAge(int age) {

        if(age>0 && age<=200){
            this.age = age;
        }else {
            System.out.println("年龄数据非法！");
        }

    }

}
