package homework.Test2.Test03;
/**
     自定义异常

     1. 写一个方法实现用户登陆，传入用户名和密码
     2. 如果用户名错误，就抛出自定义登陆异常(LoginException)，异常信息为用户名不存在。
     3. 如果密码错了就也抛出登陆异常,异常信息为密码错误
     4. 如果用户名和密码都对了,输出: 欢迎xxx
     说明：正确用户名和密码都是admin

     2. 定义异常类LoginException继承Exception
     a) 提供空参和有参构造
     3. 创建测试类Test
     a) 提供一个用于登陆的方法login(String name,String pwd),在放方法中
     i. 如果用户名错误,就抛出自定义登陆异常(LoginException),异常信息为用户名不存在。
     ii. 如果密码错了就也抛出登陆异常,异常信息为密码错误。
     iii. 如果能来到下面,就说明用户和密码都是对的，输出: 欢迎xxx
     b) 提供main方法,在main方法
     i. 使用try...catch代码块处理异常
     ii. 调用login方法,传入错误用户名,运行程序,报运行时异常,然后注释这行代码iii. 调用login方法,传入正确用户名,错误的命名,运行程序,报运行时异常,然后注释这行代码
     iv. 调用login方法,传入正确的用户名和密码
 */
public class Test03 {

    public static void main(String[] args) {

        try {
//            login("abc","abc");//用户名不存在
//            login("admin","123");//密码错误
            login("admin","admin");
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void login(String name,String pwd) throws LoginException {

        User user = userInfo();
        if (!user.getName().equals(name)){
            throw new LoginException("用户名不存在");
        }
        if (!user.getPwd().equals(pwd)){
            throw new LoginException("密码错误");
        }
        System.out.println("欢迎登陆~");

    }

    private static User userInfo() {

        User user =new User("admin","admin");
        return user;
    }


}
