package homework;
/**
 * 定义getChar方,法，能够将数字，根据ASCII码表，转换为对应的字符并返回，只转换大小写字母和数字字符
 * 编写步骤：
 1. 定义getChar方法,参数为(int num),返回值char类型
 2. 在getChar方法中,将传入的参数num转成char类型变量ch
 3. 在getChar方法中判断chs是否是小写字母.如果是返回ch
 4. 在getChar方法中判断chs是否是大写字母.如果是返回ch
 5. 在getChar方法中判断chs是否是数字字符.如果是返回ch
 6. 其他情况返回' '
 7. 在main方法中调用getChar方法,传入一个数字.使用aChar变量接收getChar方法的返回值
 8. 输出aChar变量
 * */
public class Test04 {

    public static void main(String[] args) {

       char achor =  getChar(111);
       System.out.println(achor);

    }

    public static char getChar(int num){

        char ch = (char)num;
        int chs = num;
        if ( 48 <= chs && chs <= 57 ){
            return ch;
        }else if (65 <= chs && chs <= 90) {
            return ch;
        }else if(97 <= chs && chs <= 122){
            return ch;
        }else {
            return ' ';
        }

        /*if (ch > 'a' && ch < 'z') {
            return ch;
        } else if (ch > 'A' && ch < 'Z') {
            return ch;
        } else if (ch > '0' && ch < '9') {
            return ch;
        } else {
            return ' ';
        }*/

    }

}
