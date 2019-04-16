package basecode._08泛型接口;
/**
     目标：能够定义和使用泛型接口

     讲解：
         1. 泛型接口概念
             在定义接口时定义了泛型变量

         2. 泛型接口的定义格式
             interface 接口名<泛型变量>{
              // 将泛型变量当成一种数据类型使用
             }

         3. 泛型接口的实现方式
             1. 方式1：实现接口同时指定泛型变量的具体数据类型，不够灵活(不推荐使用)
             2. 方式2：实现接口时不指定泛型变量的具体数据类型，此时将实现类定义泛型类，泛型变量的具体数据类型
                由使用者创建对象时指定，如果不指定默认是Object(比较灵活，推荐使用)

     小结：
         1.泛型接口的格式
            interface 接口名<泛型变量>{ }
         2.泛型接口实现方式
             1. 方式1：实现接口同时指定泛型变量的具体数据类型，不够灵活(不推荐使用)
             2. 方式2：实现接口时不指定泛型变量的具体数据类型，此时将实现类定义泛型类，泛型变量的具体数据类型
             由使用者创建对象时指定，如果不指定默认是Object(比较灵活，推荐使用)

 */
public class Demo09 {

    public static void main(String[] args) {

        // 创建学生对象
        Student stu = new Student();
        //使用一个实现类完成下面冗余代码的功能
        BaseDao<Student> stuDao = new BaseDao<>(); //这里只使用了一个泛型类去实现泛型接口，不需要写多个实现类就可以完成Dao对于不同类型对象的 功能是实现
        stuDao.save(stu);

        // 创建产品
        Product pro = new Product();
        //使用一个实现类完成下面冗余代码的功能
        BaseDao<Product> proDao = new BaseDao<>();
        proDao.save(pro);

    }
    //下面两中方法，在实现Dao接口的时候是需要分开建立对应类型（Student,Product）的实现类来是实现对应的功能，
    //这样会导致代码冗余和多文件处理不够便捷，不符合编程思维逻辑性。
    private void test01(){

        // 创建学生对象
        Student stu = new Student();
        // 创建StudentDao对象
        StudentDao stud = new StudentDao();//这个StudentDao类是用来实现Dao接口的，而Stundent是单独的对象类。
        stud.save(stu);

    }

    private void test02(){

        // 创建产品
        Product pro = new Product();
        // 创建ProductDao对象
        ProductDao prod = new ProductDao();
        prod.save(pro);

    }

}
