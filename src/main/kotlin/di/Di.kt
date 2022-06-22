package di

import java.lang.reflect.Constructor
import javax.naming.Context

/**
 * author：kuaidao2022@reworld.com
 * data: 2022/6/21 14:37
 * Car 类可能需要引用 Engine 类。这些必需类称为依赖项
 */

/**
 * 汽车
 */
//③构造参数形式提供
class Car(constructorEngine: Engine) {

   //①car类中构造
  val engine=Engine()


    //③参数形式提供
    fun setDependency(engine: Engine){

    }

 //②从其他地方抓取
//    val engine = Context.getEngineService()
}

/**
 * 引擎
 */
class Engine{
    fun start() {
        println("引擎发动")
    }

}

//其中第三种也就是通过构造函数或者方法函数接收外部传递的依赖对象
//
//使用类自己构造依赖项的缺点
//依赖强耦合，测试难度大，代码重复
//图片一
//使用参数传递（构造函数入参，函数入参形式）优点
//依赖强耦合，测试难度大，代码重复
//图片二
//
//
//Android 中有两种主要的依赖项注入方式： 构造函数注入，字段注入（或 setter 注入）
//
//tips：无法进行构造函数注入（Android框架类，由系统实例化）。使用字段注入时，依赖项将在创建类后实例化
//
//控制反转



