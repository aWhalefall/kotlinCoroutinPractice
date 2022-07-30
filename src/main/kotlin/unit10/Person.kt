package unit10

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties


/**
 * author：kuaidao2022@reworld.com
 * data: 2022/7/30 13:34
 * 反射的call 和 invoke 比较 一个类型安全，一个非类型安全
 */

class Person(val name: String, val age: Int) {
    fun printInfo() {
        println("$name-$age")
    }
}


fun main(args: Array<String>) {

    // sample1()
    //sample2()

//    val kFun = ::callTest
//    kFun.call(100)

//    val sunFun = ::sum
//    val sum = sunFun.invoke(1, 2) + sunFun.invoke(4, 5)
//    println("sun result = $sum")

    //   sample3()


    val weichao2 = Person("weichao2", 18)
    weichao2.javaClass.kotlin.memberProperties.forEach {
        println(it.name)
    }

}


private fun java.lang.StringBuilder.serializeObject(any: Any) {
    val kClass = any.javaClass.kotlin
    val properties = kClass.memberProperties
    properties.joinToString(":", prefix = "{", postfix = "}", transform = { prop ->
        serializeObject(prop.name)
        append(":")
//        serializeObject(prop.get(any))
    })
}

private fun sample3() {
    val temp = 2
    val person = Person("weichao", 18)

    val personKotlin = person.javaClass.kotlin
    println(personKotlin.constructors)
}

val topLevel = 1

object Unit10 {

    @JvmStatic
    fun main(args: Array<String>) {
        val toplevel = ::topLevel
        println(toplevel)
    }

}


fun sum(x: Int, y: Int) = x + y


fun callTest(key: Int) = println("调用 $key")


fun sample1() {
    val person = Person("weichao", 18)
    //获取到类的字节码
    val kClass: KClass<Person> = person.javaClass.kotlin
    println(kClass.qualifiedName)
    //包括方法和属性
    println(kClass.simpleName)
}
