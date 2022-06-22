package di


/**
 * author：kuaidao2022@reworld.com
 * data: 2022/6/21 15:57
 * 1.普通类泛型函数
 */

interface Factor<T>{
    fun  create(): T
}
interface Factor2<V>{
    fun <k:V> create(): V
}
interface Factor3<V>{
    fun <V> create(): V
}

interface Factor4{
    fun <V> create(t:V): V
}

class AB{
    fun <T> list() {}
}

//首先一个原则，泛型类的T在泛型类中作为普通参数使用

//泛型类声明
//泛型函数声明

fun main(args: Array<String>) {

    hello<String>()
}

fun <T> hello():List<T> = listOf()