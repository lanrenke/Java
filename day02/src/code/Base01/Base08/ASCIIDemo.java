package code.Base01.Base08;
/**
 目标：ASCII编码表。

 计算机的底层是不能存储字符的。计算机的底层都是硬件。

 计算机的底层只能存储二进制。0 1  二进制就是整数!!

 2个开关可以表示4个信息。
 8个开关可以表示256个信息。

 美国人：
 为自己国家的字符做存储机制。
 美国人用每8个开关存储一个字符就够了。对于美国人来说够用了。

 A  65
 B  66
 C  67

 'a'  97
 'b'  98
 'c'  99

 '0'  48

 这套编码规则称为ASCII编码表。

 小结：
 字符在计算机底层其实就是一个编号。完全可以把字符当整数用。
 char的范围是小于int范围的
 */
public class ASCIIDemo {

    public static void main(String[] args) {

        // char是字符
        // int 是整数编号
        // char的范围是小于int范围的
        int rs = 'a';//自动类型转换
        System.out.println(rs);//输出 97

        char rs1 = 24464;//自动类型转换，24464在char范围内
        System.out.println(rs1);

        System.out.println('a' + 3); // 能算就算！!


    }

}
