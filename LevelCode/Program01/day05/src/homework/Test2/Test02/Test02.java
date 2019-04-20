package homework.Test2.Test02;
/**
     自定义异常类

     请用代码描述:
     在一款角色扮演游戏中,每一个人都会有名字和生命值；角色的生命值不能为负数。
     要求：当一个人物的生命值为负数的时候需要抛出自定的异常

     2. 自定义异常类NoLifeValueExption继承RuntimeException
         a) 提供空参和有参构造
         b) 在有参构造中，需要调用父类的有参构造，把异常信息传入。
     3. 定义Person类
         a) 属性：名称(name)和生命值(lifeValue)
         b) 提供空参构造
         c) 提供有参构造i. 使用setXxx方法给name和lifeValue赋值
         d) 提供setter和getter方法
            i. 在setLifeValue(intlifeValue)方法中
             1. 如果 lifeValue为负数,就抛出NoLifeValueException,异常信息为：生命值不能为负数:xxx.
             2. 然后在给成员lifeValue赋值.
             4. 定义测试类Test15
        e) 提供main方法,在main方法中
         i. 使用满参构造方法创建Person对象,分数传入一个负数,运行程序
         ii. 由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
         iii. 使用空参构造创建Person对象
         iv. 调用setLifeValue(int lifeValue)方法,传入一个正数,运行程序
         v. 调用setLifeValue(int lifeValue)方法,传入一个负数,运行程序
 */
public class Test02 {

    public static void main(String[] args) {

        Person person = new Person();

        person.setLifeValue(500);
        System.out.println(person.getLifeValue());

        person.setLifeValue(-100);
        System.out.println(person.getLifeValue());//上面代码异常 不会执行到这里

    }

}
