package code._09权限修饰符;
/**
    目标：权限修饰符。

    权限修饰符：控制修饰的成员的访问范围。

    已经学过了public 和 private
    public 可以在任何地方直接访问，private只能在本类中访问。

    权限由小到大             private         缺省       protected         public
    本类中                   √              √           √               √
    同一个包下的其他类中        X              √           √               √
    不同包下类                X              X           X               √
    不同包下的子类             X              X           √               √

    小结：
        根据需求决定用哪个修饰符！

 */
public class MyModifierDemo02 {
}
