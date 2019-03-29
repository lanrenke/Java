package code.Base01;
/** 逻辑运算符`
        逻辑运算符，是用来对多个布尔类型的数据进行运算的，运算结果也是布尔值`true`或者`false`。
        逻辑运算符有哪些：&&短路与 ，||短路或，!非 ， ^异或 ，&单与 ，  |单或
        a.短路与
        必须前后两个布尔结果都是true,最终结果才是true.
        只要有一个是false结果就一定是false。

        b.短路或
        只要前后两个布尔结果有一个是true，最终结果就是true.
        必须前后都是false，最终结果才能是false.

        c.（非）
        !false结果就是true.
        !true结果就是false.

        d.异或 ^
        只要前后两个布尔值不同，结果就是true.
        如果前后两个布尔值相同结果一定是false.

        e.&（与）
        结果与&&是一样的。
        必须前后两个布尔结果都是true,最终结果才是true.
        只有有一个是false结果就是false。
        区别：
        && ：如果发现第一个条件已经是false了，根本不会执行第二个布尔值。直接返回false.
        & ：如果发现第一个条件已经是false了，依然会去判断第二个条件。

        f.|（或）
        结果与||也是一样的。
        只要前后两个布尔结果有一个是true，最终结果就是true.
        必须前后都是false，最终结果才能是false.
        || ：如果发现第一个条件已经是true，根本不会执行第二个条件，直接返回true.
        | :  如果发现第一个条件已经是true，依然会去判断第二个条件。

 */
public class OperatorDemo01 {

    public static void main(String[] args) {

        int age = 18;
        int years = 1;
        System.out.println( age >= 18 && years >= 1); //true

        System.out.println("----------------------");
        // 1.短路与 &&
        System.out.println(true && true);  //true
        System.out.println(true && false); //false
        System.out.println(false && false);//false
        System.out.println(false && true); //false

        System.out.println("----------------------");
        // 2.短路||
        System.out.println(true || true);  //true
        System.out.println(true || false); //true
        System.out.println(false || false);//false
        System.out.println(false || true); //true

        System.out.println("----------------------");
        // 3.非 !
        System.out.println(!true); //false
        System.out.println(!false);//true

        System.out.println("----------------------");
        // 4.单&
        System.out.println(true & true);  //true
        System.out.println(true & false); //false
        System.out.println(false & false);//false
        System.out.println(false & true); //false

        System.out.println("----------------------");
        // 5.|
        System.out.println(true | true);  //true
        System.out.println(true | false); //true
        System.out.println(false | false);//false
        System.out.println(false | true); //true

        System.out.println("----------------------");
        // 6.异或^ 不同是true , 相同是false
        System.out.println(true ^ true);  //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ false);//false
        System.out.println(false ^ true); //true

    }

}
