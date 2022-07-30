package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author：kuaidao2022@reworld.com
 * data: 2022/7/19 14:20
 * 指定一个接口类，动态生成一个接口实现的对象。返回接口引用，接口引用声明的接口方法。会自动执行实现类中的具体实现
 */
public class App {
    public static void main(String[] args) {
        IVehical vehical = (IVehical) Proxy.newProxyInstance(
                IVehical.class.getClassLoader(),
                new Class[]{IVehical.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        final Object[] emptyArgs = new Object[0];
                        if (method.getDeclaringClass() == Object.class) {
                            return method.invoke(this, args);
                        }
                        //代理对象car
                        System.out.println(proxy);
                        System.out.println(method);
                        System.out.println(args);

                        return null;
                    }
                });
        // 谁是，实现该接口的iml类。
        vehical.run("你好");
    }


    /**
     * 代理类
     */
    class A implements IVehical {
        /**
         * 被代理 Car
         */
        public Car car;

        public A(Car car) {
            this.car = car;
        }

        @Override
        public void run(String value) {
            car.run(value);
        }

        @Override
        public void helloWorld() {
            car.helloWorld();
        }
    }
}


