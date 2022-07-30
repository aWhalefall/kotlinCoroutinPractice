package fx;

/**
 * author：kuaidao2022@reworld.com
 * data: 2022/7/19 15:14
 * 1.普通类与泛型类（运行时动态替换类型参数，可以写更通用的函数）
 * 2.抽象类中静态方法
 */
public class Client {

    A a = new A<String>();
    B b = new B();

    public static void main(String[] args) {
        //调用抽象类静态方法
        AbstractStatic.greeting();
    }

}
