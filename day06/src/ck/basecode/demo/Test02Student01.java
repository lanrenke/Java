package ck.basecode.demo;

public class Test02Student01 {

    private String name;

    // this出现在实例方法中，谁调用这个方法（哪个对象调用这个方法），
    // this就代表谁（this就代表哪个对象）.
    // this.name是对象中的成员变量name ,
    // 右边的name是形参变量name,此时就区分开来了。
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
