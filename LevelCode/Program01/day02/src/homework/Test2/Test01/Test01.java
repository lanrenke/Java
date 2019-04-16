package homework.Test2.Test01;


import java.util.ArrayList;
import java.util.Iterator;

/**
     1.⾃定义对象
     2.迭代器

     ⾃定义学⽣类:包含姓名,年龄,成绩属性.私有成员变量,⽣成⽆参,有参构造⽅法,⽣成get/set⽅法.创建5
        个学⽣放到ArrayList中.使⽤迭代器获取每个学⽣信息.统计总分,平均分,最⾼分,最低分并输出
         1. 定义学⽣类⽣成类⽆参,有参构造⽅法,⽣成get/set⽅法.
         2. 定义ArrayList
         3. 添加5个学⽣
         4. 获取迭代器
         5. 定义总分
         6. 定义最⾼分
         7. 定义最低分
         8. 循环判断是否有下⼀个学⽣
         9. 使⽤next⽅法获取学⽣对象
         10. 将这个学⽣对象的分数添加到总分
         11. 判断这个学⽣的分数是否⼤于最⼤分数
         12. 这个学⽣的分数⼤于最⼤分数.最⼤分数等于这个学⽣的分数
         13. 判断这个学⽣的分数是否⼤低最⼤分数
         14. 这个学⽣的分数⼩于最⼩分数.最⼩分数等于这个学⽣的分数
         15. 计算平均分(平均分 = 总分/⼈数)
         16. 打印总分,最⾼分,最低分
 */
public class Test01 {

    public static void main(String[] args) {

        //2. 定义ArrayList
        ArrayList<Student> list = new ArrayList<>();
        //3. 添加5个学⽣
        list.add(new Student("张三",18,95));
        list.add(new Student("李四",17,75));
        list.add(new Student("王五",19,65));
        list.add(new Student("关六",16,60));
        list.add(new Student("杨七",20,80));

        //4. 获取迭代器
        Iterator<Student> it = list.iterator();//一定要记得是通过方法来建立而不是new一个对象建立
        //5. 定义总分
        double count = 0;
        //6. 定义最⾼分
        double max = list.get(0).getScore();
        //7. 定义最低分
        double min = list.get(0).getScore();

        //8. 循环判断是否有下⼀个学⽣
        while (it.hasNext()){
            //9. 使⽤next⽅法获取学⽣对象
            double num = it.next().getScore();
            count += num;
            if (num > max){
                max = num;
            }else if(num < min){
                min = num;
            }
        }

        double avgScore = count / list.size();
        System.out.println("总分:"+count+"最⾼分:"+max+"最低分:"+min+"平均分:"+avgScore);

    }

}
