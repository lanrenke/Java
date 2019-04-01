package code.Base03;
/**
 目标：数组的访问和长度属性。

 数组的索引：每个数组的元素都存在索引，索引从0开始。

 数组的访问格式：
     取值：数组名称[索引值]
     赋值：数组名称[索引值] = 数据值;
 数组的长度：
    数组名称.length
 小结：
    数组的最大索引=数组名称.length -1

 */
public class ArrayDemo01 {

    public static void main(String[] args) {

        // 1.创建一个数组。
        // 存储一个班级4个学生的名称
        //  数据类型[] 数组名称 = new 数据类型[]{元素1,元素2,元素3,...};
        String[] names = new String[]{"迪丽热巴","古力娜扎","马尔扎哈","卡尔扎巴"};

        /** 取值：获取数组的元素值 */
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
//        System.out.println(names[4]); //数组越界

        System.out.println("-------------");
        /** 赋值  */
        names[1] = "猪八戒";
        System.out.println(names[0]);
        System.out.println(names[1]);//值已被修改
        System.out.println(names[2]);
        System.out.println(names[3]);

        System.out.println("-------------");
        /**
         数组的长度 :数组的长度是数组的属性，所以可以直接点.length
         就是元素的个数
         */
        System.out.println(names.length);

    }

}
